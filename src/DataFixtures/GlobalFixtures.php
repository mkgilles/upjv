<?php


namespace App\DataFixtures;

use App\Entity\Cinema;
use App\Entity\Film;
use App\Entity\Schedule;
use App\Entity\Utilisateur;
use App\Entity\Review;
use App\Entity\Ticket;
use App\Entity\Payment;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;


class GlobalFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        // Create and persist Cinema entities
        $cinema = new Cinema();
        $cinema->setName('Cinema Name');
        $cinema->setLocation('Cinema Location');
        $cinema->setContactInformation('Cinema Contact Information');
        $manager->persist($cinema);

        // Create and persist Film entities
        $movie = new Film();
        $movie->setTitle('Movie Title');
        $movie->setGenre('Movie Genre');
        $movie->setDirector('Movie Director');
        $movie->setCast(['Actor 1', 'Actor 2']);
        $movie->setSynopsis('Movie Synopsis');
        $movie->setRating(4.5);
        $manager->persist($movie);

        // Create and persist Schedule entities
        $schedule = new Schedule();
        $schedule->setDate(new \DateTime());
        $schedule->setHeure(new \DateTime());
        $schedule->setFilm($movie);
        $manager->persist($schedule);

        // Create and persist Utilisateur entities
        $user = new Utilisateur();
        $user->setUsername('Username');
        $user->setPassword('Password');
        $user->setRole('Role');
        $manager->persist($user);

        // Create and persist Review entities
        $review = new Review();
        $review->setUser($user);
        $review->setMovie($movie);
        $review->setRating(4);
        $review->setComment('Review Comment');
        $manager->persist($review);

        // Create and persist Ticket entities
        $ticket = new Ticket();
        $ticket->setSchedule($schedule);
        $ticket->setUser($user);
        $ticket->setSeat('Seat');
        $ticket->setPrice(10.0);
        $manager->persist($ticket);

        // Create and persist Payment entities
        $payment = new Payment();
        $payment->setUser($user);
        $payment->setAmount(10.0);
        $payment->setDate(new \DateTime());
        $payment->setPaymentMethod('Payment Method');
        $manager->persist($payment);
        $manager.flush();
    }
}