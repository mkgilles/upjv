<?php

namespace App\DataFixtures;

use App\Entity\Utilisateur;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class UtilisateurFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $utilisateur = new Utilisateur();
        $utilisateur->setUsername('username');
        $utilisateur->setPassword('password');
        // ...
        $manager->persist($utilisateur);

        // Repeat for as many Utilisateur entities as you want to create

        $manager->flush();
    }
}