<?php

namespace App\Entity;

use App\Repository\TicketRepository;
use Doctrine\ORM\Mapping as ORM;
use Symfony\Component\Validator\Constraints as Assert;

#[ORM\Entity(repositoryClass: TicketRepository::class)]
class Ticket
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\ManyToOne(targetEntity: Schedule::class)]
    #[Assert\NotNull]
    private ?Schedule $schedule = null;

    #[ORM\ManyToOne(targetEntity: Utilisateur::class)]
    #[Assert\NotNull]
    private ?Utilisateur $utilisateur = null;

    #[ORM\Column(length: 255)]
    private ?string $seat = null;

    #[ORM\Column]
    private ?float $price = null;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getSchedule(): ?Schedule
    {
        return $this->schedule;
    }

    public function setSchedule(Schedule $schedule): self
    {
        $this->schedule = $schedule;

        return $this;
    }

    public function getUtilisateur(): ?Utilisateur
    {
        return $this->utilisateur;
    }

    public function setUtilisateur(Utilisateur $utilisateur): self
    {
        $this->utilisateur = $utilisateur;

        return $this;
    }

    public function getSeat(): ?string
    {
        return $this->seat;
    }

    public function setSeat(string $seat): self
    {
        $this->seat = $seat;

        return $this;
    }

    public function getPrice(): ?float
    {
        return $this->price;
    }

    public function setPrice(float $price): self
    {
        $this->price = $price;

        return $this;
    }
}