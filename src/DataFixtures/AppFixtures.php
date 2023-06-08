<?php

namespace App\DataFixtures;

use App\Entity\Cinema;
use App\Entity\Film;
use App\Entity\Payment;
use App\Entity\Review;
use App\Entity\Schedule;
use App\Entity\Ticket;
use App\Entity\Utilisateur;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class AppFixtures extends Fixture
{
    public function load(ObjectManager $manager)
    {
        // Create some users
        $user1 = new Utilisateur();
        $user1->setUsername('user1');
        $user1->setPassword('password1');
        $user1->setRole('client');
        $manager->persist($user1);

        $user2 = new Utilisateur();
        $user2->setUsername('user2');
        $user2->setPassword('password2');
        $user2->setRole('client');
        $manager->persist($user2);

        // Create some films
        $film1 = new Film();
        $film1->setTitle('Film 1');
        $film1->setGenre('Action');
        $film1->setDirector('Realisateur 1');
        $film1->setCast('Actor 1, Actor 2');
        $film1->setSynopsis('Synopsis 1');
        $film1->setRating(4.5);
        $manager->persist($film1);

        $film2 = new Film();
        $film2->setTitle('Film 2');
        $film2->setGenre('Comedy');
        $film2->setDirector('Realisateur 2');
        $film2->setCast('Actor 3', 'Actor 4');
        $film2->setSynopsis('Synopsis 2');
        $film2->setRating(3.5);
        $manager->persist($film2);

        // Create some schedules
        $schedule1 = new Schedule();
        $schedule1->setDate(new \DateTime('2023-01-01'));
        $schedule1->setHeure(new \DateTime('19:00:00'));
        $schedule1->setFilm($film1);
        $manager->persist($schedule1);

        $schedule2 = new Schedule();
        $schedule2->setDate(new \DateTime('2023-01-02'));
        $schedule2->setHeure(new \DateTime('20:00:00'));
        $schedule2->setFilm($film2);
        $manager->persist($schedule2);

        // Create some tickets
        $ticket1 = new Ticket();
        $ticket1->setSchedule($schedule1);
        $ticket1->setUtilisateur($user1);
        $ticket1->setSeat('A1');
        $ticket1->setPrice(10.0);
        $manager->persist($ticket1);

        # ... Add more fixtures as needed

        # Finally flush all changes to the database
        # This will persist all the created objects to the database
        # and generate the corresponding SQL queries
        # to insert the data into the database tables.
        # You can run this command multiple times to create multiple sets of data.
        # For example, you can create multiple users, films, schedules, etc.
        # Just make sure to call persist() on each object before calling flush().
        # You can also use references to link objects together.
        # For example, you can create a user and then create a ticket for that user.
        # See the DoctrineFixturesBundle documentation for more information.
        # https://symfony.com/doc/current/bundles/DoctrineFixturesBundle/index.html
        #
        # Note that this is just an example and you should adapt it to your needs.
        # You can add more data or change the data as needed.

        # Finally flush all changes to the database
        # This will persist all the created objects to the database
        # and generate the corresponding SQL queries
        # to insert the data into the database tables.
        # You can run this command multiple times to create multiple sets of data.
        # For example, you can create multiple users, films, schedules, etc.
        # Just make sure to call persist() on each object before calling flush().
        # You can also use references to link objects together.
        # For example, you can create a user and then create a ticket for that user.
        # See the DoctrineFixturesBundle documentation for more information.
        # https://symfony.com/doc/current/bundles/DoctrineFixturesBundle/index.html
        #
        # Note that this is just an example and you should adapt it to your needs.
        # You can add more data or change the data as needed.

        $manager->flush();
    }
}
