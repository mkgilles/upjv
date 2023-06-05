<?php

namespace App\DataFixtures;
use App\Entity\Cinema;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class CinemaFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $cinema = new Cinema();
        $cinema->setName('Cinema Name');
        $cinema->setLocation('Cinema Location');
        // ...
        $manager->persist($cinema);

        $manager->flush();

        $manager->flush();
    }
}
