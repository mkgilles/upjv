<?php

namespace App\DataFixtures;
use App\Entity\Film;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class FilmFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $film = new Film();
        $film->setTitle('Film Title');
        $film->setGenre('Film Genre');
        // ...
        $manager->persist($film);

        $manager->flush();
    }
}
