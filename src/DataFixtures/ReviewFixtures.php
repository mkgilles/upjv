<?php

namespace App\DataFixtures;
use App\Entity\Review;

use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;

class ReviewFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $review = new Review();
        $review->setComment('Review comment');
        $review->setRating(5);
        // ...
        $manager->persist($review);

        $manager->flush();
    }
}
