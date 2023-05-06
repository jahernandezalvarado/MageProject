package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author Plopman
 */
public final class Portal extends ExpansionSet {

    private static final Portal instance = new Portal();

    public static Portal getInstance() {
        return instance;
    }

    private Portal() {
        super("Portal", "POR", ExpansionSet.buildDate(1997, 5, 1), SetType.SUPPLEMENTAL);
        this.blockName = "Beginner";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Alabaster Dragon", 1, Rarity.RARE, mage.cards.a.AlabasterDragon.class));
        cards.add(new SetCardInfo("Alluring Scent", 157, Rarity.RARE, mage.cards.a.AlluringScent.class));
        cards.add(new SetCardInfo("Anaconda", "158+", Rarity.UNCOMMON, mage.cards.a.Anaconda.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Anaconda", 158, Rarity.UNCOMMON, mage.cards.a.Anaconda.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ancestral Memories", 40, Rarity.RARE, mage.cards.a.AncestralMemories.class));
        cards.add(new SetCardInfo("Angelic Blessing", 2, Rarity.COMMON, mage.cards.a.AngelicBlessing.class));
        cards.add(new SetCardInfo("Archangel", 3, Rarity.RARE, mage.cards.a.Archangel.class));
        cards.add(new SetCardInfo("Ardent Militia", 4, Rarity.UNCOMMON, mage.cards.a.ArdentMilitia.class));
        cards.add(new SetCardInfo("Armageddon", 5, Rarity.RARE, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Armored Pegasus", 6, Rarity.COMMON, mage.cards.a.ArmoredPegasus.class));
        cards.add(new SetCardInfo("Arrogant Vampire", 79, Rarity.UNCOMMON, mage.cards.a.ArrogantVampire.class));
        cards.add(new SetCardInfo("Assassin's Blade", "80s", Rarity.COMMON, mage.cards.a.AssassinsBlade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Assassin's Blade", 80, Rarity.UNCOMMON, mage.cards.a.AssassinsBlade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Balance of Power", 41, Rarity.RARE, mage.cards.b.BalanceOfPower.class));
        cards.add(new SetCardInfo("Baleful Stare", 42, Rarity.UNCOMMON, mage.cards.b.BalefulStare.class));
        cards.add(new SetCardInfo("Bee Sting", 159, Rarity.UNCOMMON, mage.cards.b.BeeSting.class));
        cards.add(new SetCardInfo("Blaze", "118+", Rarity.UNCOMMON, mage.cards.b.Blaze.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blaze", "118s", Rarity.UNCOMMON, mage.cards.b.Blaze.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blaze", 118, Rarity.UNCOMMON, mage.cards.b.Blaze.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blessed Reversal", 7, Rarity.RARE, mage.cards.b.BlessedReversal.class));
        cards.add(new SetCardInfo("Blinding Light", 8, Rarity.RARE, mage.cards.b.BlindingLight.class));
        cards.add(new SetCardInfo("Bog Imp", 81, Rarity.COMMON, mage.cards.b.BogImp.class));
        cards.add(new SetCardInfo("Bog Raiders", 82, Rarity.COMMON, mage.cards.b.BogRaiders.class));
        cards.add(new SetCardInfo("Bog Wraith", 83, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Boiling Seas", 119, Rarity.UNCOMMON, mage.cards.b.BoilingSeas.class));
        cards.add(new SetCardInfo("Border Guard", 9, Rarity.COMMON, mage.cards.b.BorderGuard.class));
        cards.add(new SetCardInfo("Breath of Life", 10, Rarity.COMMON, mage.cards.b.BreathOfLife.class));
        cards.add(new SetCardInfo("Bull Hippo", 160, Rarity.UNCOMMON, mage.cards.b.BullHippo.class));
        cards.add(new SetCardInfo("Burning Cloak", 120, Rarity.COMMON, mage.cards.b.BurningCloak.class));
        cards.add(new SetCardInfo("Capricious Sorcerer", 43, Rarity.RARE, mage.cards.c.CapriciousSorcerer.class));
        cards.add(new SetCardInfo("Charging Bandits", 84, Rarity.UNCOMMON, mage.cards.c.ChargingBandits.class));
        cards.add(new SetCardInfo("Charging Paladin", 11, Rarity.UNCOMMON, mage.cards.c.ChargingPaladin.class));
        cards.add(new SetCardInfo("Charging Rhino", 161, Rarity.RARE, mage.cards.c.ChargingRhino.class));
        cards.add(new SetCardInfo("Cloak of Feathers", 44, Rarity.COMMON, mage.cards.c.CloakOfFeathers.class));
        cards.add(new SetCardInfo("Cloud Dragon", 45, Rarity.RARE, mage.cards.c.CloudDragon.class));
        cards.add(new SetCardInfo("Cloud Pirates", 46, Rarity.COMMON, mage.cards.c.CloudPirates.class));
        cards.add(new SetCardInfo("Cloud Spirit", 47, Rarity.UNCOMMON, mage.cards.c.CloudSpirit.class));
        cards.add(new SetCardInfo("Command of Unsummoning", 48, Rarity.UNCOMMON, mage.cards.c.CommandOfUnsummoning.class));
        cards.add(new SetCardInfo("Coral Eel", 49, Rarity.COMMON, mage.cards.c.CoralEel.class));
        cards.add(new SetCardInfo("Craven Giant", 121, Rarity.COMMON, mage.cards.c.CravenGiant.class));
        cards.add(new SetCardInfo("Craven Knight", 85, Rarity.COMMON, mage.cards.c.CravenKnight.class));
        cards.add(new SetCardInfo("Cruel Bargain", 86, Rarity.RARE, mage.cards.c.CruelBargain.class));
        cards.add(new SetCardInfo("Cruel Fate", 50, Rarity.RARE, mage.cards.c.CruelFate.class));
        cards.add(new SetCardInfo("Cruel Tutor", 87, Rarity.RARE, mage.cards.c.CruelTutor.class));
        cards.add(new SetCardInfo("Deep Wood", 162, Rarity.UNCOMMON, mage.cards.d.DeepWood.class));
        cards.add(new SetCardInfo("Deep-Sea Serpent", 51, Rarity.UNCOMMON, mage.cards.d.DeepSeaSerpent.class));
        cards.add(new SetCardInfo("Defiant Stand", 12, Rarity.UNCOMMON, mage.cards.d.DefiantStand.class));
        cards.add(new SetCardInfo("Deja Vu", 53, Rarity.COMMON, mage.cards.d.DejaVu.class));
        cards.add(new SetCardInfo("Desert Drake", 122, Rarity.UNCOMMON, mage.cards.d.DesertDrake.class));
        cards.add(new SetCardInfo("Devastation", 123, Rarity.RARE, mage.cards.d.Devastation.class));
        cards.add(new SetCardInfo("Devoted Hero", 13, Rarity.COMMON, mage.cards.d.DevotedHero.class));
        cards.add(new SetCardInfo("Djinn of the Lamp", 52, Rarity.RARE, mage.cards.d.DjinnOfTheLamp.class));
        cards.add(new SetCardInfo("Dread Charge", 88, Rarity.RARE, mage.cards.d.DreadCharge.class));
        cards.add(new SetCardInfo("Dread Reaper", 89, Rarity.RARE, mage.cards.d.DreadReaper.class));
        cards.add(new SetCardInfo("Dry Spell", 90, Rarity.UNCOMMON, mage.cards.d.DrySpell.class));
        cards.add(new SetCardInfo("Earthquake", 124, Rarity.RARE, mage.cards.e.Earthquake.class));
        cards.add(new SetCardInfo("Ebon Dragon", 91, Rarity.RARE, mage.cards.e.EbonDragon.class));
        cards.add(new SetCardInfo("Elite Cat Warrior", "163+", Rarity.COMMON, mage.cards.e.EliteCatWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elite Cat Warrior", 163, Rarity.COMMON, mage.cards.e.EliteCatWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Cache", "164s", Rarity.COMMON, mage.cards.e.ElvenCache.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Cache", 164, Rarity.COMMON, mage.cards.e.ElvenCache.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Ranger", 165, Rarity.COMMON, mage.cards.e.ElvishRanger.class));
        cards.add(new SetCardInfo("Endless Cockroaches", 92, Rarity.RARE, mage.cards.e.EndlessCockroaches.class));
        cards.add(new SetCardInfo("Exhaustion", 54, Rarity.RARE, mage.cards.e.Exhaustion.class));
        cards.add(new SetCardInfo("False Peace", 14, Rarity.COMMON, mage.cards.f.FalsePeace.class));
        cards.add(new SetCardInfo("Feral Shadow", 93, Rarity.COMMON, mage.cards.f.FeralShadow.class));
        cards.add(new SetCardInfo("Final Strike", 94, Rarity.RARE, mage.cards.f.FinalStrike.class));
        cards.add(new SetCardInfo("Fire Dragon", 125, Rarity.RARE, mage.cards.f.FireDragon.class));
        cards.add(new SetCardInfo("Fire Imp", 126, Rarity.UNCOMMON, mage.cards.f.FireImp.class));
        cards.add(new SetCardInfo("Fire Snake", 127, Rarity.COMMON, mage.cards.f.FireSnake.class));
        cards.add(new SetCardInfo("Fire Tempest", 128, Rarity.RARE, mage.cards.f.FireTempest.class));
        cards.add(new SetCardInfo("Flashfires", 129, Rarity.UNCOMMON, mage.cards.f.Flashfires.class));
        cards.add(new SetCardInfo("Fleet-Footed Monk", 15, Rarity.COMMON, mage.cards.f.FleetFootedMonk.class));
        cards.add(new SetCardInfo("Flux", 55, Rarity.UNCOMMON, mage.cards.f.Flux.class));
        cards.add(new SetCardInfo("Foot Soldiers", 16, Rarity.COMMON, mage.cards.f.FootSoldiers.class));
        cards.add(new SetCardInfo("Forest", "212s", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "213s", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "214s", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "215s", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 212, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 213, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 214, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 215, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forked Lightning", 130, Rarity.RARE, mage.cards.f.ForkedLightning.class));
        cards.add(new SetCardInfo("Fruition", "166s", Rarity.COMMON, mage.cards.f.Fruition.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fruition", 166, Rarity.COMMON, mage.cards.f.Fruition.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Giant Octopus", 56, Rarity.COMMON, mage.cards.g.GiantOctopus.class));
        cards.add(new SetCardInfo("Giant Spider", 167, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Gift of Estates", 17, Rarity.RARE, mage.cards.g.GiftOfEstates.class));
        cards.add(new SetCardInfo("Goblin Bully", 131, Rarity.COMMON, mage.cards.g.GoblinBully.class));
        cards.add(new SetCardInfo("Gorilla Warrior", 168, Rarity.COMMON, mage.cards.g.GorillaWarrior.class));
        cards.add(new SetCardInfo("Gravedigger", 95, Rarity.UNCOMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grizzly Bears", 169, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Hand of Death", "96+", Rarity.COMMON, mage.cards.h.HandOfDeath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hand of Death", 96, Rarity.COMMON, mage.cards.h.HandOfDeath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Harsh Justice", 18, Rarity.RARE, mage.cards.h.HarshJustice.class));
        cards.add(new SetCardInfo("Highland Giant", 132, Rarity.COMMON, mage.cards.h.HighlandGiant.class));
        cards.add(new SetCardInfo("Hill Giant", 133, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Horned Turtle", "57s", Rarity.COMMON, mage.cards.h.HornedTurtle.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Horned Turtle", 57, Rarity.COMMON, mage.cards.h.HornedTurtle.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Howling Fury", 97, Rarity.COMMON, mage.cards.h.HowlingFury.class));
        cards.add(new SetCardInfo("Hulking Cyclops", "134s", Rarity.UNCOMMON, mage.cards.h.HulkingCyclops.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hulking Cyclops", 134, Rarity.UNCOMMON, mage.cards.h.HulkingCyclops.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hulking Goblin", 135, Rarity.COMMON, mage.cards.h.HulkingGoblin.class));
        cards.add(new SetCardInfo("Hurricane", 170, Rarity.RARE, mage.cards.h.Hurricane.class));
        cards.add(new SetCardInfo("Ingenious Thief", 58, Rarity.UNCOMMON, mage.cards.i.IngeniousThief.class));
        cards.add(new SetCardInfo("Island", "200s", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "201s", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "202s", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "203s", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 200, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 201, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 202, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 203, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jungle Lion", 171, Rarity.COMMON, mage.cards.j.JungleLion.class));
        cards.add(new SetCardInfo("Keen-Eyed Archers", 19, Rarity.COMMON, mage.cards.k.KeenEyedArchers.class));
        cards.add(new SetCardInfo("King's Assassin", 98, Rarity.RARE, mage.cards.k.KingsAssassin.class));
        cards.add(new SetCardInfo("Knight Errant", 20, Rarity.COMMON, mage.cards.k.KnightErrant.class));
        cards.add(new SetCardInfo("Last Chance", 136, Rarity.RARE, mage.cards.l.LastChance.class));
        cards.add(new SetCardInfo("Lava Axe", 137, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Lava Flow", 138, Rarity.UNCOMMON, mage.cards.l.LavaFlow.class));
        cards.add(new SetCardInfo("Lizard Warrior", 139, Rarity.COMMON, mage.cards.l.LizardWarrior.class));
        cards.add(new SetCardInfo("Man-o'-War", 59, Rarity.UNCOMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Mercenary Knight", 99, Rarity.RARE, mage.cards.m.MercenaryKnight.class));
        cards.add(new SetCardInfo("Merfolk of the Pearl Trident", 60, Rarity.COMMON, mage.cards.m.MerfolkOfThePearlTrident.class));
        cards.add(new SetCardInfo("Mind Knives", 100, Rarity.COMMON, mage.cards.m.MindKnives.class));
        cards.add(new SetCardInfo("Mind Rot", 101, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Minotaur Warrior", 140, Rarity.COMMON, mage.cards.m.MinotaurWarrior.class));
        cards.add(new SetCardInfo("Mobilize", 172, Rarity.COMMON, mage.cards.m.Mobilize.class));
        cards.add(new SetCardInfo("Monstrous Growth", "173+", Rarity.COMMON, mage.cards.m.MonstrousGrowth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Monstrous Growth", 173, Rarity.COMMON, mage.cards.m.MonstrousGrowth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Moon Sprite", 174, Rarity.UNCOMMON, mage.cards.m.MoonSprite.class));
        cards.add(new SetCardInfo("Mountain Goat", 141, Rarity.UNCOMMON, mage.cards.m.MountainGoat.class));
        cards.add(new SetCardInfo("Mountain", "208s", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "209s", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "210s", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "211s", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 208, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 209, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 210, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 211, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Muck Rats", 102, Rarity.COMMON, mage.cards.m.MuckRats.class));
        cards.add(new SetCardInfo("Mystic Denial", 61, Rarity.UNCOMMON, mage.cards.m.MysticDenial.class));
        cards.add(new SetCardInfo("Natural Order", 175, Rarity.RARE, mage.cards.n.NaturalOrder.class));
        cards.add(new SetCardInfo("Natural Spring", 176, Rarity.UNCOMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Nature's Cloak", 177, Rarity.RARE, mage.cards.n.NaturesCloak.class));
        cards.add(new SetCardInfo("Nature's Lore", 178, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Nature's Ruin", 103, Rarity.UNCOMMON, mage.cards.n.NaturesRuin.class));
        cards.add(new SetCardInfo("Needle Storm", 179, Rarity.UNCOMMON, mage.cards.n.NeedleStorm.class));
        cards.add(new SetCardInfo("Noxious Toad", 104, Rarity.UNCOMMON, mage.cards.n.NoxiousToad.class));
        cards.add(new SetCardInfo("Omen", 62, Rarity.COMMON, mage.cards.o.Omen.class));
        cards.add(new SetCardInfo("Owl Familiar", 63, Rarity.COMMON, mage.cards.o.OwlFamiliar.class));
        cards.add(new SetCardInfo("Panther Warriors", 180, Rarity.COMMON, mage.cards.p.PantherWarriors.class));
        cards.add(new SetCardInfo("Path of Peace", 21, Rarity.COMMON, mage.cards.p.PathOfPeace.class));
        cards.add(new SetCardInfo("Personal Tutor", 64, Rarity.UNCOMMON, mage.cards.p.PersonalTutor.class));
        cards.add(new SetCardInfo("Phantom Warrior", 65, Rarity.RARE, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Pillaging Horde", 142, Rarity.RARE, mage.cards.p.PillagingHorde.class));
        cards.add(new SetCardInfo("Plains", "196s", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "197s", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "198s", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "199s", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 196, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 197, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 198, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 199, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plant Elemental", 181, Rarity.UNCOMMON, mage.cards.p.PlantElemental.class));
        cards.add(new SetCardInfo("Primeval Force", 182, Rarity.RARE, mage.cards.p.PrimevalForce.class));
        cards.add(new SetCardInfo("Prosperity", "66s", Rarity.RARE, mage.cards.p.Prosperity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Prosperity", 66, Rarity.RARE, mage.cards.p.Prosperity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pyroclasm", 143, Rarity.RARE, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Python", 105, Rarity.COMMON, mage.cards.p.Python.class));
        cards.add(new SetCardInfo("Raging Cougar", 144, Rarity.COMMON, mage.cards.r.RagingCougar.class));
        cards.add(new SetCardInfo("Raging Goblin", "145+", Rarity.COMMON, mage.cards.r.RagingGoblin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Raging Goblin", 145, Rarity.COMMON, mage.cards.r.RagingGoblin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Raging Minotaur", 146, Rarity.COMMON, mage.cards.r.RagingMinotaur.class));
        cards.add(new SetCardInfo("Rain of Salt", 147, Rarity.UNCOMMON, mage.cards.r.RainOfSalt.class));
        cards.add(new SetCardInfo("Rain of Tears", 106, Rarity.UNCOMMON, mage.cards.r.RainOfTears.class));
        cards.add(new SetCardInfo("Raise Dead", "107s", Rarity.COMMON, mage.cards.r.RaiseDead.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Raise Dead", 107, Rarity.COMMON, mage.cards.r.RaiseDead.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Redwood Treefolk", 183, Rarity.COMMON, mage.cards.r.RedwoodTreefolk.class));
        cards.add(new SetCardInfo("Regal Unicorn", 22, Rarity.COMMON, mage.cards.r.RegalUnicorn.class));
        cards.add(new SetCardInfo("Renewing Dawn", 23, Rarity.UNCOMMON, mage.cards.r.RenewingDawn.class));
        cards.add(new SetCardInfo("Rowan Treefolk", 184, Rarity.COMMON, mage.cards.r.RowanTreefolk.class));
        cards.add(new SetCardInfo("Sacred Knight", 24, Rarity.COMMON, mage.cards.s.SacredKnight.class));
        cards.add(new SetCardInfo("Sacred Nectar", 25, Rarity.COMMON, mage.cards.s.SacredNectar.class));
        cards.add(new SetCardInfo("Scorching Spear", 148, Rarity.COMMON, mage.cards.s.ScorchingSpear.class));
        cards.add(new SetCardInfo("Scorching Winds", 149, Rarity.UNCOMMON, mage.cards.s.ScorchingWinds.class));
        cards.add(new SetCardInfo("Seasoned Marshal", 26, Rarity.UNCOMMON, mage.cards.s.SeasonedMarshal.class));
        cards.add(new SetCardInfo("Serpent Assassin", 108, Rarity.RARE, mage.cards.s.SerpentAssassin.class));
        cards.add(new SetCardInfo("Serpent Warrior", 109, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Skeletal Crocodile", 110, Rarity.COMMON, mage.cards.s.SkeletalCrocodile.class));
        cards.add(new SetCardInfo("Skeletal Snake", 111, Rarity.COMMON, mage.cards.s.SkeletalSnake.class));
        cards.add(new SetCardInfo("Snapping Drake", 67, Rarity.COMMON, mage.cards.s.SnappingDrake.class));
        cards.add(new SetCardInfo("Sorcerous Sight", 68, Rarity.COMMON, mage.cards.s.SorcerousSight.class));
        cards.add(new SetCardInfo("Soul Shred", 112, Rarity.COMMON, mage.cards.s.SoulShred.class));
        cards.add(new SetCardInfo("Spined Wurm", 185, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spiritual Guardian", 27, Rarity.RARE, mage.cards.s.SpiritualGuardian.class));
        cards.add(new SetCardInfo("Spitting Earth", 150, Rarity.COMMON, mage.cards.s.SpittingEarth.class));
        cards.add(new SetCardInfo("Spotted Griffin", 28, Rarity.COMMON, mage.cards.s.SpottedGriffin.class));
        cards.add(new SetCardInfo("Stalking Tiger", 186, Rarity.COMMON, mage.cards.s.StalkingTiger.class));
        cards.add(new SetCardInfo("Starlight", 29, Rarity.UNCOMMON, mage.cards.s.Starlight.class));
        cards.add(new SetCardInfo("Starlit Angel", "30s", Rarity.UNCOMMON, mage.cards.s.StarlitAngel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Starlit Angel", 30, Rarity.UNCOMMON, mage.cards.s.StarlitAngel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Steadfastness", 31, Rarity.COMMON, mage.cards.s.Steadfastness.class));
        cards.add(new SetCardInfo("Stern Marshal", 32, Rarity.RARE, mage.cards.s.SternMarshal.class));
        cards.add(new SetCardInfo("Stone Rain", 151, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Crow", 69, Rarity.COMMON, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Summer Bloom", 187, Rarity.RARE, mage.cards.s.SummerBloom.class));
        cards.add(new SetCardInfo("Swamp", 204, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 205, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 206, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 207, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sylvan Tutor", 188, Rarity.RARE, mage.cards.s.SylvanTutor.class));
        cards.add(new SetCardInfo("Symbol of Unsummoning", 70, Rarity.COMMON, mage.cards.s.SymbolOfUnsummoning.class));
        cards.add(new SetCardInfo("Taunt", "71s", Rarity.RARE, mage.cards.t.Taunt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Taunt", 71, Rarity.RARE, mage.cards.t.Taunt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temporary Truce", 33, Rarity.RARE, mage.cards.t.TemporaryTruce.class));
        cards.add(new SetCardInfo("Theft of Dreams", 72, Rarity.UNCOMMON, mage.cards.t.TheftOfDreams.class));
        cards.add(new SetCardInfo("Thing from the Deep", 73, Rarity.RARE, mage.cards.t.ThingFromTheDeep.class));
        cards.add(new SetCardInfo("Thundering Wurm", 189, Rarity.RARE, mage.cards.t.ThunderingWurm.class));
        cards.add(new SetCardInfo("Thundermare", 152, Rarity.RARE, mage.cards.t.Thundermare.class));
        cards.add(new SetCardInfo("Tidal Surge", 74, Rarity.COMMON, mage.cards.t.TidalSurge.class));
        cards.add(new SetCardInfo("Time Ebb", 75, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Touch of Brilliance", 76, Rarity.COMMON, mage.cards.t.TouchOfBrilliance.class));
        cards.add(new SetCardInfo("Treetop Defense", 190, Rarity.RARE, mage.cards.t.TreetopDefense.class));
        cards.add(new SetCardInfo("Undying Beast", 113, Rarity.COMMON, mage.cards.u.UndyingBeast.class));
        cards.add(new SetCardInfo("Untamed Wilds", 191, Rarity.UNCOMMON, mage.cards.u.UntamedWilds.class));
        cards.add(new SetCardInfo("Valorous Charge", 34, Rarity.UNCOMMON, mage.cards.v.ValorousCharge.class));
        cards.add(new SetCardInfo("Vampiric Feast", "114s", Rarity.UNCOMMON, mage.cards.v.VampiricFeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vampiric Feast", 114, Rarity.UNCOMMON, mage.cards.v.VampiricFeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vampiric Touch", 115, Rarity.COMMON, mage.cards.v.VampiricTouch.class));
        cards.add(new SetCardInfo("Venerable Monk", 35, Rarity.UNCOMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Vengeance", 36, Rarity.UNCOMMON, mage.cards.v.Vengeance.class));
        cards.add(new SetCardInfo("Virtue's Ruin", 116, Rarity.UNCOMMON, mage.cards.v.VirtuesRuin.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 153, Rarity.RARE, mage.cards.v.VolcanicDragon.class));
        cards.add(new SetCardInfo("Volcanic Hammer", 154, Rarity.COMMON, mage.cards.v.VolcanicHammer.class));
        cards.add(new SetCardInfo("Wall of Granite", 155, Rarity.UNCOMMON, mage.cards.w.WallOfGranite.class));
        cards.add(new SetCardInfo("Wall of Swords", 37, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Warrior's Charge", "38+", Rarity.COMMON, mage.cards.w.WarriorsCharge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Warrior's Charge", 38, Rarity.COMMON, mage.cards.w.WarriorsCharge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Whiptail Wurm", 192, Rarity.UNCOMMON, mage.cards.w.WhiptailWurm.class));
        cards.add(new SetCardInfo("Wicked Pact", "117s", Rarity.RARE, mage.cards.w.WickedPact.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Wicked Pact", 117, Rarity.RARE, mage.cards.w.WickedPact.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Willow Dryad", 193, Rarity.COMMON, mage.cards.w.WillowDryad.class));
        cards.add(new SetCardInfo("Wind Drake", 77, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Winds of Change", 156, Rarity.RARE, mage.cards.w.WindsOfChange.class));
        cards.add(new SetCardInfo("Winter's Grasp", 194, Rarity.UNCOMMON, mage.cards.w.WintersGrasp.class));
        cards.add(new SetCardInfo("Withering Gaze", 78, Rarity.UNCOMMON, mage.cards.w.WitheringGaze.class));
        cards.add(new SetCardInfo("Wood Elves", 195, Rarity.RARE, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Wrath of God", 39, Rarity.RARE, mage.cards.w.WrathOfGod.class));
    }
}