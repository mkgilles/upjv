<?php

namespace App\DataFixtures;

use App\Entity\Ticket;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class TicketFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $ticket = new Ticket();
        $ticket->setSeat('A1');
        $ticket->setPrice(10);
        // ...
        $manager->persist($ticket);

        // Repeat for as many Ticket entities as you want to create

        $manager->flush();
    }
}