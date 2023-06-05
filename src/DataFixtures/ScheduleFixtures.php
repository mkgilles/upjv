<?php

namespace App\DataFixtures;

use App\Entity\Schedule;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class ScheduleFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $schedule = new Schedule();
        $schedule->setDate(new \DateTime());
        $schedule->setHeure(new \DateTime());
        // ...
        $manager->persist($schedule);

        $manager->flush();
    }
}