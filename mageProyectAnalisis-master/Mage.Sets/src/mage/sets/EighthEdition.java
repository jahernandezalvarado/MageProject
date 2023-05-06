package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.List;

public final class EighthEdition extends ExpansionSet {

    private static final EighthEdition instance = new EighthEdition();

    public static EighthEdition getInstance() {
        return instance;
    }

    private EighthEdition() {
        super("Eighth Edition", "8ED", ExpansionSet.buildDate(2003, 7, 28), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Abyssal Specter", 117, Rarity.UNCOMMON, mage.cards.a.AbyssalSpecter.class));
        cards.add(new SetCardInfo("Air Elemental", 59, Rarity.UNCOMMON, mage.cards.a.AirElemental.class));
        cards.add(new SetCardInfo("Aladdin's Ring", 291, Rarity.RARE, mage.cards.a.AladdinsRing.class));
        cards.add(new SetCardInfo("Ambition's Cost", 118, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Anaba Shaman", 175, Rarity.COMMON, mage.cards.a.AnabaShaman.class));
        cards.add(new SetCardInfo("Angelic Page", 2, Rarity.COMMON, mage.cards.a.AngelicPage.class));
        cards.add(new SetCardInfo("Angel of Mercy", 1, Rarity.UNCOMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Archivist", 60, Rarity.RARE, mage.cards.a.Archivist.class));
        cards.add(new SetCardInfo("Ardent Militia", 3, Rarity.UNCOMMON, mage.cards.a.ArdentMilitia.class));
        cards.add(new SetCardInfo("Avatar of Hope", 4, Rarity.RARE, mage.cards.a.AvatarOfHope.class));
        cards.add(new SetCardInfo("Aven Cloudchaser", 5, Rarity.COMMON, mage.cards.a.AvenCloudchaser.class));
        cards.add(new SetCardInfo("Aven Fisher", 61, Rarity.COMMON, mage.cards.a.AvenFisher.class));
        cards.add(new SetCardInfo("Aven Flock", 6, Rarity.COMMON, mage.cards.a.AvenFlock.class));
        cards.add(new SetCardInfo("Balance of Power", 62, Rarity.RARE, mage.cards.b.BalanceOfPower.class));
        cards.add(new SetCardInfo("Balduvian Barbarians", 176, Rarity.COMMON, mage.cards.b.BalduvianBarbarians.class));
        cards.add(new SetCardInfo("Beast of Burden", 292, Rarity.RARE, mage.cards.b.BeastOfBurden.class));
        cards.add(new SetCardInfo("Birds of Paradise", 233, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 234, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blaze", 177, Rarity.UNCOMMON, mage.cards.b.Blaze.class));
        cards.add(new SetCardInfo("Blessed Reversal", 7, Rarity.RARE, mage.cards.b.BlessedReversal.class));
        cards.add(new SetCardInfo("Blinding Angel", 8, Rarity.RARE, mage.cards.b.BlindingAngel.class));
        cards.add(new SetCardInfo("Blood Moon", 178, Rarity.RARE, mage.cards.b.BloodMoon.class));
        cards.add(new SetCardInfo("Bloodshot Cyclops", 179, Rarity.RARE, mage.cards.b.BloodshotCyclops.class));
        cards.add(new SetCardInfo("Bog Imp", 119, Rarity.COMMON, mage.cards.b.BogImp.class));
        cards.add(new SetCardInfo("Bog Wraith", 120, Rarity.UNCOMMON, mage.cards.b.BogWraith.class));
        cards.add(new SetCardInfo("Boil", 180, Rarity.UNCOMMON, mage.cards.b.Boil.class));
        cards.add(new SetCardInfo("Boomerang", 63, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Brass Herald", 293, Rarity.RARE, mage.cards.b.BrassHerald.class));
        cards.add(new SetCardInfo("Bribery", 64, Rarity.RARE, mage.cards.b.Bribery.class));
        cards.add(new SetCardInfo("Call of the Wild", 235, Rarity.RARE, mage.cards.c.CallOfTheWild.class));
        cards.add(new SetCardInfo("Canopy Spider", 236, Rarity.COMMON, mage.cards.c.CanopySpider.class));
        cards.add(new SetCardInfo("Canyon Wildcat", 181, Rarity.COMMON, mage.cards.c.CanyonWildcat.class));
        cards.add(new SetCardInfo("Carrion Wall", 121, Rarity.UNCOMMON, mage.cards.c.CarrionWall.class));
        cards.add(new SetCardInfo("Catalog", 65, Rarity.COMMON, mage.cards.c.Catalog.class));
        cards.add(new SetCardInfo("Chastise", 9, Rarity.UNCOMMON, mage.cards.c.Chastise.class));
        cards.add(new SetCardInfo("Choke", 237, Rarity.UNCOMMON, mage.cards.c.Choke.class));
        cards.add(new SetCardInfo("Cinder Wall", 182, Rarity.COMMON, mage.cards.c.CinderWall.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 10, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 11, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 12, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 13, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 14, Rarity.UNCOMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("City of Brass", 322, Rarity.RARE, mage.cards.c.CityOfBrass.class));
        cards.add(new SetCardInfo("Coastal Hornclaw", 66, Rarity.COMMON, mage.cards.c.CoastalHornclaw.class));
        cards.add(new SetCardInfo("Coastal Piracy", 67, Rarity.RARE, mage.cards.c.CoastalPiracy.class));
        cards.add(new SetCardInfo("Coastal Tower", 323, Rarity.UNCOMMON, mage.cards.c.CoastalTower.class));
        cards.add(new SetCardInfo("Coat of Arms", 294, Rarity.RARE, mage.cards.c.CoatOfArms.class));
        cards.add(new SetCardInfo("Coercion", 122, Rarity.COMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Collective Unconscious", 238, Rarity.RARE, mage.cards.c.CollectiveUnconscious.class));
        cards.add(new SetCardInfo("Concentrate", 68, Rarity.UNCOMMON, mage.cards.c.Concentrate.class));
        cards.add(new SetCardInfo("Confiscate", 69, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Coral Eel", 70, Rarity.COMMON, mage.cards.c.CoralEel.class));
        cards.add(new SetCardInfo("Cowardice", 71, Rarity.RARE, mage.cards.c.Cowardice.class));
        cards.add(new SetCardInfo("Craw Wurm", 239, Rarity.COMMON, mage.cards.c.CrawWurm.class));
        cards.add(new SetCardInfo("Creeping Mold", 240, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crossbow Infantry", 15, Rarity.COMMON, mage.cards.c.CrossbowInfantry.class));
        cards.add(new SetCardInfo("Crystal Rod", 295, Rarity.UNCOMMON, mage.cards.c.CrystalRod.class));
        cards.add(new SetCardInfo("Curiosity", 72, Rarity.UNCOMMON, mage.cards.c.Curiosity.class));
        cards.add(new SetCardInfo("Daring Apprentice", 73, Rarity.RARE, mage.cards.d.DaringApprentice.class));
        cards.add(new SetCardInfo("Dark Banishing", 123, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Deathgazer", 126, Rarity.UNCOMMON, mage.cards.d.Deathgazer.class));
        cards.add(new SetCardInfo("Death Pit Offering", 124, Rarity.RARE, mage.cards.d.DeathPitOffering.class));
        cards.add(new SetCardInfo("Death Pits of Rath", 125, Rarity.RARE, mage.cards.d.DeathPitsOfRath.class));
        cards.add(new SetCardInfo("Deepwood Ghoul", 127, Rarity.COMMON, mage.cards.d.DeepwoodGhoul.class));
        cards.add(new SetCardInfo("Defense Grid", 296, Rarity.RARE, mage.cards.d.DefenseGrid.class));
        cards.add(new SetCardInfo("Deflection", 74, Rarity.RARE, mage.cards.d.Deflection.class));
        cards.add(new SetCardInfo("Dehydration", 75, Rarity.COMMON, mage.cards.d.Dehydration.class));
        cards.add(new SetCardInfo("Demolish", 183, Rarity.UNCOMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demystify", 16, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 128, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Dingus Egg", 297, Rarity.RARE, mage.cards.d.DingusEgg.class));
        cards.add(new SetCardInfo("Disrupting Scepter", 298, Rarity.RARE, mage.cards.d.DisruptingScepter.class));
        cards.add(new SetCardInfo("Distorting Lens", 299, Rarity.RARE, mage.cards.d.DistortingLens.class));
        cards.add(new SetCardInfo("Diving Griffin", 17, Rarity.COMMON, mage.cards.d.DivingGriffin.class));
        cards.add(new SetCardInfo("Drudge Skeletons", 129, Rarity.COMMON, mage.cards.d.DrudgeSkeletons.class));
        cards.add(new SetCardInfo("Dusk Imp", 130, Rarity.COMMON, mage.cards.d.DuskImp.class));
        cards.add(new SetCardInfo("Dwarven Demolition Team", 184, Rarity.UNCOMMON, mage.cards.d.DwarvenDemolitionTeam.class));
        cards.add(new SetCardInfo("Eager Cadet", "S1", Rarity.COMMON, mage.cards.e.EagerCadet.class));
        cards.add(new SetCardInfo("Eastern Paladin", 131, Rarity.RARE, mage.cards.e.EasternPaladin.class));
        cards.add(new SetCardInfo("Elfhame Palace", 324, Rarity.UNCOMMON, mage.cards.e.ElfhamePalace.class));
        cards.add(new SetCardInfo("Elite Archers", 18, Rarity.RARE, mage.cards.e.EliteArchers.class));
        cards.add(new SetCardInfo("Elite Javelineer", 19, Rarity.UNCOMMON, mage.cards.e.EliteJavelineer.class));
        cards.add(new SetCardInfo("Elvish Champion", 241, Rarity.RARE, mage.cards.e.ElvishChampion.class));
        cards.add(new SetCardInfo("Elvish Lyrist", 242, Rarity.UNCOMMON, mage.cards.e.ElvishLyrist.class));
        cards.add(new SetCardInfo("Elvish Pioneer", 243, Rarity.COMMON, mage.cards.e.ElvishPioneer.class));
        cards.add(new SetCardInfo("Elvish Piper", 244, Rarity.RARE, mage.cards.e.ElvishPiper.class));
        cards.add(new SetCardInfo("Elvish Scrapper", 245, Rarity.UNCOMMON, mage.cards.e.ElvishScrapper.class));
        cards.add(new SetCardInfo("Emperor Crocodile", 246, Rarity.RARE, mage.cards.e.EmperorCrocodile.class));
        cards.add(new SetCardInfo("Enormous Baloth", "S6", Rarity.UNCOMMON, mage.cards.e.EnormousBaloth.class));
        cards.add(new SetCardInfo("Enrage", 185, Rarity.UNCOMMON, mage.cards.e.Enrage.class));
        cards.add(new SetCardInfo("Ensnaring Bridge", 300, Rarity.RARE, mage.cards.e.EnsnaringBridge.class));
        cards.add(new SetCardInfo("Evacuation", 76, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Execute", 132, Rarity.UNCOMMON, mage.cards.e.Execute.class));
        cards.add(new SetCardInfo("Fallen Angel", 133, Rarity.RARE, mage.cards.f.FallenAngel.class));
        cards.add(new SetCardInfo("Fear", 134, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Fecundity", 247, Rarity.UNCOMMON, mage.cards.f.Fecundity.class));
        cards.add(new SetCardInfo("Fertile Ground", 248, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fighting Drake", 77, Rarity.UNCOMMON, mage.cards.f.FightingDrake.class));
        cards.add(new SetCardInfo("Flash Counter", 78, Rarity.COMMON, mage.cards.f.FlashCounter.class));
        cards.add(new SetCardInfo("Flashfires", 186, Rarity.UNCOMMON, mage.cards.f.Flashfires.class));
        cards.add(new SetCardInfo("Fleeting Image", 79, Rarity.RARE, mage.cards.f.FleetingImage.class));
        cards.add(new SetCardInfo("Flight", 80, Rarity.COMMON, mage.cards.f.Flight.class));
        cards.add(new SetCardInfo("Flying Carpet", 301, Rarity.RARE, mage.cards.f.FlyingCarpet.class));
        cards.add(new SetCardInfo("Fodder Cannon", 302, Rarity.UNCOMMON, mage.cards.f.FodderCannon.class));
        cards.add(new SetCardInfo("Foratog", 249, Rarity.UNCOMMON, mage.cards.f.Foratog.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fugitive Wizard", 81, Rarity.COMMON, mage.cards.f.FugitiveWizard.class));
        cards.add(new SetCardInfo("Fungusaur", 250, Rarity.RARE, mage.cards.f.Fungusaur.class));
        cards.add(new SetCardInfo("Furnace of Rath", 187, Rarity.RARE, mage.cards.f.FurnaceOfRath.class));
        cards.add(new SetCardInfo("Fyndhorn Elder", 251, Rarity.UNCOMMON, mage.cards.f.FyndhornElder.class));
        cards.add(new SetCardInfo("Gaea's Herald", 252, Rarity.RARE, mage.cards.g.GaeasHerald.class));
        cards.add(new SetCardInfo("Giant Badger", 253, Rarity.COMMON, mage.cards.g.GiantBadger.class));
        cards.add(new SetCardInfo("Giant Cockroach", 135, Rarity.COMMON, mage.cards.g.GiantCockroach.class));
        cards.add(new SetCardInfo("Giant Growth", 254, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Octopus", "S3", Rarity.COMMON, mage.cards.g.GiantOctopus.class));
        cards.add(new SetCardInfo("Giant Spider", 255, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Glorious Anthem", 20, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Glory Seeker", 21, Rarity.COMMON, mage.cards.g.GlorySeeker.class));
        cards.add(new SetCardInfo("Gluttonous Zombie", 136, Rarity.UNCOMMON, mage.cards.g.GluttonousZombie.class));
        cards.add(new SetCardInfo("Goblin Chariot", 188, Rarity.COMMON, mage.cards.g.GoblinChariot.class));
        cards.add(new SetCardInfo("Goblin Glider", 189, Rarity.UNCOMMON, mage.cards.g.GoblinGlider.class));
        cards.add(new SetCardInfo("Goblin King", 190, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Goblin Raider", 191, Rarity.COMMON, mage.cards.g.GoblinRaider.class));
        cards.add(new SetCardInfo("Gravedigger", 138, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grave Pact", 137, Rarity.RARE, mage.cards.g.GravePact.class));
        cards.add(new SetCardInfo("Grizzly Bears", 256, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Guerrilla Tactics", 192, Rarity.UNCOMMON, mage.cards.g.GuerrillaTactics.class));
        cards.add(new SetCardInfo("Hammer of Bogardan", 193, Rarity.RARE, mage.cards.h.HammerOfBogardan.class));
        cards.add(new SetCardInfo("Healing Salve", 22, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Hibernation", 82, Rarity.UNCOMMON, mage.cards.h.Hibernation.class));
        cards.add(new SetCardInfo("Hill Giant", 194, Rarity.COMMON, mage.cards.h.HillGiant.class));
        cards.add(new SetCardInfo("Holy Day", 23, Rarity.COMMON, mage.cards.h.HolyDay.class));
        cards.add(new SetCardInfo("Holy Strength", 24, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Honor Guard", 25, Rarity.COMMON, mage.cards.h.HonorGuard.class));
        cards.add(new SetCardInfo("Horned Troll", 257, Rarity.COMMON, mage.cards.h.HornedTroll.class));
        cards.add(new SetCardInfo("Horned Turtle", 83, Rarity.COMMON, mage.cards.h.HornedTurtle.class));
        cards.add(new SetCardInfo("Howling Mine", 303, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Hulking Cyclops", 195, Rarity.UNCOMMON, mage.cards.h.HulkingCyclops.class));
        cards.add(new SetCardInfo("Hunted Wumpus", 258, Rarity.UNCOMMON, mage.cards.h.HuntedWumpus.class));
        cards.add(new SetCardInfo("Index", 84, Rarity.COMMON, mage.cards.i.Index.class));
        cards.add(new SetCardInfo("Inferno", 196, Rarity.RARE, mage.cards.i.Inferno.class));
        cards.add(new SetCardInfo("Inspiration", 85, Rarity.COMMON, mage.cards.i.Inspiration.class));
        cards.add(new SetCardInfo("Intrepid Hero", 26, Rarity.RARE, mage.cards.i.IntrepidHero.class));
        cards.add(new SetCardInfo("Intruder Alarm", 86, Rarity.RARE, mage.cards.i.IntruderAlarm.class));
        cards.add(new SetCardInfo("Invisibility", 87, Rarity.UNCOMMON, mage.cards.i.Invisibility.class));
        cards.add(new SetCardInfo("Iron Star", 304, Rarity.UNCOMMON, mage.cards.i.IronStar.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivory Cup", 305, Rarity.UNCOMMON, mage.cards.i.IvoryCup.class));
        cards.add(new SetCardInfo("Ivory Mask", 27, Rarity.RARE, mage.cards.i.IvoryMask.class));
        cards.add(new SetCardInfo("Jayemdae Tome", 306, Rarity.RARE, mage.cards.j.JayemdaeTome.class));
        cards.add(new SetCardInfo("Karma", 28, Rarity.UNCOMMON, mage.cards.k.Karma.class));
        cards.add(new SetCardInfo("Larceny", 139, Rarity.RARE, mage.cards.l.Larceny.class));
        cards.add(new SetCardInfo("Lava Axe", 197, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Lava Hounds", 198, Rarity.RARE, mage.cards.l.LavaHounds.class));
        cards.add(new SetCardInfo("Lesser Gargadon", 199, Rarity.UNCOMMON, mage.cards.l.LesserGargadon.class));
        cards.add(new SetCardInfo("Lhurgoyf", 259, Rarity.RARE, mage.cards.l.Lhurgoyf.class));
        cards.add(new SetCardInfo("Lightning Blast", 200, Rarity.UNCOMMON, mage.cards.l.LightningBlast.class));
        cards.add(new SetCardInfo("Lightning Elemental", 201, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Living Terrain", 260, Rarity.UNCOMMON, mage.cards.l.LivingTerrain.class));
        cards.add(new SetCardInfo("Llanowar Behemoth", 261, Rarity.UNCOMMON, mage.cards.l.LlanowarBehemoth.class));
        cards.add(new SetCardInfo("Lone Wolf", 262, Rarity.COMMON, mage.cards.l.LoneWolf.class));
        cards.add(new SetCardInfo("Looming Shade", 140, Rarity.COMMON, mage.cards.l.LoomingShade.class));
        cards.add(new SetCardInfo("Lord of the Undead", 141, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Lure", 263, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Maggot Carrier", 142, Rarity.COMMON, mage.cards.m.MaggotCarrier.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 88, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Mana Clash", 202, Rarity.RARE, mage.cards.m.ManaClash.class));
        cards.add(new SetCardInfo("Mana Leak", 89, Rarity.COMMON, mage.cards.m.ManaLeak.class));
        cards.add(new SetCardInfo("Maro", 264, Rarity.RARE, mage.cards.m.Maro.class));
        cards.add(new SetCardInfo("Master Decoy", 29, Rarity.COMMON, mage.cards.m.MasterDecoy.class));
        cards.add(new SetCardInfo("Master Healer", 30, Rarity.RARE, mage.cards.m.MasterHealer.class));
        cards.add(new SetCardInfo("Megrim", 143, Rarity.UNCOMMON, mage.cards.m.Megrim.class));
        cards.add(new SetCardInfo("Merchant of Secrets", 90, Rarity.COMMON, mage.cards.m.MerchantOfSecrets.class));
        cards.add(new SetCardInfo("Merchant Scroll", 91, Rarity.UNCOMMON, mage.cards.m.MerchantScroll.class));
        cards.add(new SetCardInfo("Might of Oaks", 265, Rarity.RARE, mage.cards.m.MightOfOaks.class));
        cards.add(new SetCardInfo("Millstone", 307, Rarity.RARE, mage.cards.m.Millstone.class));
        cards.add(new SetCardInfo("Mind Rot", 144, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mind Slash", 145, Rarity.UNCOMMON, mage.cards.m.MindSlash.class));
        cards.add(new SetCardInfo("Mind Sludge", 146, Rarity.UNCOMMON, mage.cards.m.MindSludge.class));
        cards.add(new SetCardInfo("Mogg Sentry", 203, Rarity.RARE, mage.cards.m.MoggSentry.class));
        cards.add(new SetCardInfo("Monstrous Growth", 266, Rarity.COMMON, mage.cards.m.MonstrousGrowth.class));
        cards.add(new SetCardInfo("Moss Monster", 267, Rarity.COMMON, mage.cards.m.MossMonster.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Murderous Betrayal", 147, Rarity.RARE, mage.cards.m.MurderousBetrayal.class));
        cards.add(new SetCardInfo("Nantuko Disciple", 268, Rarity.COMMON, mage.cards.n.NantukoDisciple.class));
        cards.add(new SetCardInfo("Natural Affinity", 269, Rarity.RARE, mage.cards.n.NaturalAffinity.class));
        cards.add(new SetCardInfo("Naturalize", 270, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Nausea", 148, Rarity.COMMON, mage.cards.n.Nausea.class));
        cards.add(new SetCardInfo("Nekrataal", 149, Rarity.UNCOMMON, mage.cards.n.Nekrataal.class));
        cards.add(new SetCardInfo("Nightmare", 150, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Noble Purpose", 31, Rarity.RARE, mage.cards.n.NoblePurpose.class));
        cards.add(new SetCardInfo("Norwood Ranger", 271, Rarity.COMMON, mage.cards.n.NorwoodRanger.class));
        cards.add(new SetCardInfo("Obliterate", 204, Rarity.RARE, mage.cards.o.Obliterate.class));
        cards.add(new SetCardInfo("Ogre Taskmaster", 205, Rarity.UNCOMMON, mage.cards.o.OgreTaskmaster.class));
        cards.add(new SetCardInfo("Okk", 206, Rarity.RARE, mage.cards.o.Okk.class));
        cards.add(new SetCardInfo("Oracle's Attendants", 32, Rarity.RARE, mage.cards.o.OraclesAttendants.class));
        cards.add(new SetCardInfo("Orcish Artillery", 207, Rarity.UNCOMMON, mage.cards.o.OrcishArtillery.class));
        cards.add(new SetCardInfo("Orcish Spy", 208, Rarity.COMMON, mage.cards.o.OrcishSpy.class));
        cards.add(new SetCardInfo("Pacifism", 33, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Panic Attack", 209, Rarity.COMMON, mage.cards.p.PanicAttack.class));
        cards.add(new SetCardInfo("Patagia Golem", 308, Rarity.UNCOMMON, mage.cards.p.PatagiaGolem.class));
        cards.add(new SetCardInfo("Peach Garden Oath", 34, Rarity.UNCOMMON, mage.cards.p.PeachGardenOath.class));
        cards.add(new SetCardInfo("Persecute", 151, Rarity.RARE, mage.cards.p.Persecute.class));
        cards.add(new SetCardInfo("Phantom Warrior", 93, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Phyrexian Arena", 152, Rarity.RARE, mage.cards.p.PhyrexianArena.class));
        cards.add(new SetCardInfo("Phyrexian Colossus", 309, Rarity.RARE, mage.cards.p.PhyrexianColossus.class));
        cards.add(new SetCardInfo("Phyrexian Hulk", 310, Rarity.UNCOMMON, mage.cards.p.PhyrexianHulk.class));
        cards.add(new SetCardInfo("Phyrexian Plaguelord", 153, Rarity.RARE, mage.cards.p.PhyrexianPlaguelord.class));
        cards.add(new SetCardInfo("Plague Beetle", 154, Rarity.COMMON, mage.cards.p.PlagueBeetle.class));
        cards.add(new SetCardInfo("Plague Wind", 155, Rarity.RARE, mage.cards.p.PlagueWind.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Planar Portal", 311, Rarity.RARE, mage.cards.p.PlanarPortal.class));
        cards.add(new SetCardInfo("Plow Under", 272, Rarity.RARE, mage.cards.p.PlowUnder.class));
        cards.add(new SetCardInfo("Primeval Force", 273, Rarity.RARE, mage.cards.p.PrimevalForce.class));
        cards.add(new SetCardInfo("Primeval Shambler", 156, Rarity.UNCOMMON, mage.cards.p.PrimevalShambler.class));
        cards.add(new SetCardInfo("Puppeteer", 94, Rarity.UNCOMMON, mage.cards.p.Puppeteer.class));
        cards.add(new SetCardInfo("Pyroclasm", 210, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Pyrotechnics", 211, Rarity.UNCOMMON, mage.cards.p.Pyrotechnics.class));
        cards.add(new SetCardInfo("Raging Goblin", 212, Rarity.COMMON, mage.cards.r.RagingGoblin.class));
        cards.add(new SetCardInfo("Rain of Blades", 35, Rarity.UNCOMMON, mage.cards.r.RainOfBlades.class));
        cards.add(new SetCardInfo("Raise Dead", 157, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Rampant Growth", 274, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ravenous Rats", 158, Rarity.COMMON, mage.cards.r.RavenousRats.class));
        cards.add(new SetCardInfo("Razorfoot Griffin", 36, Rarity.COMMON, mage.cards.r.RazorfootGriffin.class));
        cards.add(new SetCardInfo("Redeem", 37, Rarity.COMMON, mage.cards.r.Redeem.class));
        cards.add(new SetCardInfo("Reflexes", 213, Rarity.COMMON, mage.cards.r.Reflexes.class));
        cards.add(new SetCardInfo("Regeneration", 275, Rarity.COMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Relentless Assault", 214, Rarity.RARE, mage.cards.r.RelentlessAssault.class));
        cards.add(new SetCardInfo("Remove Soul", 95, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Revive", 276, Rarity.UNCOMMON, mage.cards.r.Revive.class));
        cards.add(new SetCardInfo("Rewind", 96, Rarity.UNCOMMON, mage.cards.r.Rewind.class));
        cards.add(new SetCardInfo("Rhox", 277, Rarity.RARE, mage.cards.r.Rhox.class));
        cards.add(new SetCardInfo("Ridgeline Rager", 215, Rarity.COMMON, mage.cards.r.RidgelineRager.class));
        cards.add(new SetCardInfo("Rod of Ruin", 312, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Rolling Stones", 38, Rarity.RARE, mage.cards.r.RollingStones.class));
        cards.add(new SetCardInfo("Royal Assassin", 159, Rarity.RARE, mage.cards.r.RoyalAssassin.class));
        cards.add(new SetCardInfo("Rukh Egg", 216, Rarity.RARE, mage.cards.r.RukhEgg.class));
        cards.add(new SetCardInfo("Rushwood Dryad", 278, Rarity.COMMON, mage.cards.r.RushwoodDryad.class));
        cards.add(new SetCardInfo("Sabretooth Tiger", 217, Rarity.COMMON, mage.cards.s.SabretoothTiger.class));
        cards.add(new SetCardInfo("Sacred Ground", 39, Rarity.RARE, mage.cards.s.SacredGround.class));
        cards.add(new SetCardInfo("Sacred Nectar", 40, Rarity.COMMON, mage.cards.s.SacredNectar.class));
        cards.add(new SetCardInfo("Sage of Lat-Nam", 97, Rarity.RARE, mage.cards.s.SageOfLatNam.class));
        cards.add(new SetCardInfo("Sage Owl", 98, Rarity.COMMON, mage.cards.s.SageOwl.class));
        cards.add(new SetCardInfo("Salt Marsh", 325, Rarity.UNCOMMON, mage.cards.s.SaltMarsh.class));
        cards.add(new SetCardInfo("Samite Healer", 41, Rarity.COMMON, mage.cards.s.SamiteHealer.class));
        cards.add(new SetCardInfo("Sanctimony", 42, Rarity.UNCOMMON, mage.cards.s.Sanctimony.class));
        cards.add(new SetCardInfo("Savannah Lions", 43, Rarity.RARE, mage.cards.s.SavannahLions.class));
        cards.add(new SetCardInfo("Scathe Zombies", 160, Rarity.COMMON, mage.cards.s.ScatheZombies.class));
        cards.add(new SetCardInfo("Sea Eagle", "S4", Rarity.COMMON, mage.cards.s.SeaEagle.class));
        cards.add(new SetCardInfo("Sea Monster", 99, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Searing Wind", 218, Rarity.RARE, mage.cards.s.SearingWind.class));
        cards.add(new SetCardInfo("Seasoned Marshal", 44, Rarity.UNCOMMON, mage.cards.s.SeasonedMarshal.class));
        cards.add(new SetCardInfo("Seismic Assault", 219, Rarity.RARE, mage.cards.s.SeismicAssault.class));
        cards.add(new SetCardInfo("Serpent Warrior", 161, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Serra Angel", 45, Rarity.RARE, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Severed Legion", 163, Rarity.COMMON, mage.cards.s.SeveredLegion.class));
        cards.add(new SetCardInfo("Sever Soul", 162, Rarity.UNCOMMON, mage.cards.s.SeverSoul.class));
        cards.add(new SetCardInfo("Shatter", 220, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shifting Sky", 100, Rarity.RARE, mage.cards.s.ShiftingSky.class));
        cards.add(new SetCardInfo("Shivan Dragon", 221, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shivan Oasis", 326, Rarity.UNCOMMON, mage.cards.s.ShivanOasis.class));
        cards.add(new SetCardInfo("Shock", 222, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Shock Troops", 223, Rarity.COMMON, mage.cards.s.ShockTroops.class));
        cards.add(new SetCardInfo("Silverback Ape", "S7", Rarity.UNCOMMON, mage.cards.s.SilverbackApe.class));
        cards.add(new SetCardInfo("Sizzle", 224, Rarity.COMMON, mage.cards.s.Sizzle.class));
        cards.add(new SetCardInfo("Skull of Orm", 313, Rarity.RARE, mage.cards.s.SkullOfOrm.class));
        cards.add(new SetCardInfo("Slay", 164, Rarity.UNCOMMON, mage.cards.s.Slay.class));
        cards.add(new SetCardInfo("Sneaky Homunculus", 101, Rarity.COMMON, mage.cards.s.SneakyHomunculus.class));
        cards.add(new SetCardInfo("Solidarity", 46, Rarity.COMMON, mage.cards.s.Solidarity.class));
        cards.add(new SetCardInfo("Soul Feast", 165, Rarity.UNCOMMON, mage.cards.s.SoulFeast.class));
        cards.add(new SetCardInfo("Spellbook", 314, Rarity.UNCOMMON, mage.cards.s.Spellbook.class));
        cards.add(new SetCardInfo("Spiketail Hatchling", 102, Rarity.UNCOMMON, mage.cards.s.SpiketailHatchling.class));
        cards.add(new SetCardInfo("Spined Wurm", 279, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spineless Thug", 166, Rarity.COMMON, mage.cards.s.SpinelessThug.class));
        cards.add(new SetCardInfo("Spirit Link", 47, Rarity.UNCOMMON, mage.cards.s.SpiritLink.class));
        cards.add(new SetCardInfo("Spitting Spider", 280, Rarity.UNCOMMON, mage.cards.s.SpittingSpider.class));
        cards.add(new SetCardInfo("Spreading Algae", 281, Rarity.UNCOMMON, mage.cards.s.SpreadingAlgae.class));
        cards.add(new SetCardInfo("Standing Troops", 48, Rarity.COMMON, mage.cards.s.StandingTroops.class));
        cards.add(new SetCardInfo("Star Compass", 315, Rarity.UNCOMMON, mage.cards.s.StarCompass.class));
        cards.add(new SetCardInfo("Staunch Defenders", 49, Rarity.UNCOMMON, mage.cards.s.StaunchDefenders.class));
        cards.add(new SetCardInfo("Steal Artifact", 103, Rarity.UNCOMMON, mage.cards.s.StealArtifact.class));
        cards.add(new SetCardInfo("Stone Rain", 225, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Crow", 104, Rarity.COMMON, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Story Circle", 50, Rarity.RARE, mage.cards.s.StoryCircle.class));
        cards.add(new SetCardInfo("Stream of Life", 282, Rarity.UNCOMMON, mage.cards.s.StreamOfLife.class));
        cards.add(new SetCardInfo("Sudden Impact", 226, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Suntail Hawk", 51, Rarity.COMMON, mage.cards.s.SuntailHawk.class));
        cards.add(new SetCardInfo("Sunweb", 52, Rarity.RARE, mage.cards.s.Sunweb.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swarm of Rats", 167, Rarity.UNCOMMON, mage.cards.s.SwarmOfRats.class));
        cards.add(new SetCardInfo("Sword Dancer", 53, Rarity.UNCOMMON, mage.cards.s.SwordDancer.class));
        cards.add(new SetCardInfo("Teferi's Puzzle Box", 316, Rarity.RARE, mage.cards.t.TeferisPuzzleBox.class));
        cards.add(new SetCardInfo("Telepathy", 105, Rarity.UNCOMMON, mage.cards.t.Telepathy.class));
        cards.add(new SetCardInfo("Temporal Adept", 106, Rarity.RARE, mage.cards.t.TemporalAdept.class));
        cards.add(new SetCardInfo("Thieves' Auction", 227, Rarity.RARE, mage.cards.t.ThievesAuction.class));
        cards.add(new SetCardInfo("Thieving Magpie", 107, Rarity.UNCOMMON, mage.cards.t.ThievingMagpie.class));
        cards.add(new SetCardInfo("Thorn Elemental", 283, Rarity.RARE, mage.cards.t.ThornElemental.class));
        cards.add(new SetCardInfo("Throne of Bone", 317, Rarity.UNCOMMON, mage.cards.t.ThroneOfBone.class));
        cards.add(new SetCardInfo("Tidal Kraken", 108, Rarity.RARE, mage.cards.t.TidalKraken.class));
        cards.add(new SetCardInfo("Trade Routes", 109, Rarity.RARE, mage.cards.t.TradeRoutes.class));
        cards.add(new SetCardInfo("Trained Armodon", 284, Rarity.COMMON, mage.cards.t.TrainedArmodon.class));
        cards.add(new SetCardInfo("Treasure Trove", 110, Rarity.UNCOMMON, mage.cards.t.TreasureTrove.class));
        cards.add(new SetCardInfo("Tremor", 228, Rarity.COMMON, mage.cards.t.Tremor.class));
        cards.add(new SetCardInfo("Tundra Wolves", 54, Rarity.COMMON, mage.cards.t.TundraWolves.class));
        cards.add(new SetCardInfo("Twiddle", 111, Rarity.COMMON, mage.cards.t.Twiddle.class));
        cards.add(new SetCardInfo("Two-Headed Dragon", 229, Rarity.RARE, mage.cards.t.TwoHeadedDragon.class));
        cards.add(new SetCardInfo("Underworld Dreams", 168, Rarity.RARE, mage.cards.u.UnderworldDreams.class));
        cards.add(new SetCardInfo("Unholy Strength", 169, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Unsummon", 112, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Urborg Volcano", 327, Rarity.UNCOMMON, mage.cards.u.UrborgVolcano.class));
        cards.add(new SetCardInfo("Urza's Armor", 318, Rarity.RARE, mage.cards.u.UrzasArmor.class));
        cards.add(new SetCardInfo("Urza's Mine", 328, Rarity.UNCOMMON, mage.cards.u.UrzasMine.class));
        cards.add(new SetCardInfo("Urza's Power Plant", 329, Rarity.UNCOMMON, mage.cards.u.UrzasPowerPlant.class));
        cards.add(new SetCardInfo("Urza's Tower", 330, Rarity.UNCOMMON, mage.cards.u.UrzasTower.class));
        cards.add(new SetCardInfo("Vampiric Spirit", 170, Rarity.RARE, mage.cards.v.VampiricSpirit.class));
        cards.add(new SetCardInfo("Venerable Monk", 55, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Vengeance", "S2", Rarity.UNCOMMON, mage.cards.v.Vengeance.class));
        cards.add(new SetCardInfo("Verduran Enchantress", 285, Rarity.RARE, mage.cards.v.VerduranEnchantress.class));
        cards.add(new SetCardInfo("Vernal Bloom", 286, Rarity.RARE, mage.cards.v.VernalBloom.class));
        cards.add(new SetCardInfo("Vexing Arcanix", 319, Rarity.RARE, mage.cards.v.VexingArcanix.class));
        cards.add(new SetCardInfo("Viashino Sandstalker", 230, Rarity.UNCOMMON, mage.cards.v.ViashinoSandstalker.class));
        cards.add(new SetCardInfo("Vicious Hunger", 171, Rarity.COMMON, mage.cards.v.ViciousHunger.class));
        cards.add(new SetCardInfo("Vine Trellis", 287, Rarity.COMMON, mage.cards.v.VineTrellis.class));
        cards.add(new SetCardInfo("Vizzerdrix", "S5", Rarity.RARE, mage.cards.v.Vizzerdrix.class));
        cards.add(new SetCardInfo("Volcanic Hammer", 231, Rarity.COMMON, mage.cards.v.VolcanicHammer.class));
        cards.add(new SetCardInfo("Wall of Air", 113, Rarity.UNCOMMON, mage.cards.w.WallOfAir.class));
        cards.add(new SetCardInfo("Wall of Spears", 320, Rarity.UNCOMMON, mage.cards.w.WallOfSpears.class));
        cards.add(new SetCardInfo("Wall of Stone", 232, Rarity.UNCOMMON, mage.cards.w.WallOfStone.class));
        cards.add(new SetCardInfo("Wall of Swords", 56, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Warped Devotion", 172, Rarity.RARE, mage.cards.w.WarpedDevotion.class));
        cards.add(new SetCardInfo("Western Paladin", 173, Rarity.RARE, mage.cards.w.WesternPaladin.class));
        cards.add(new SetCardInfo("Wind Drake", 114, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Wing Snare", 288, Rarity.UNCOMMON, mage.cards.w.WingSnare.class));
        cards.add(new SetCardInfo("Wood Elves", 289, Rarity.COMMON, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Wooden Sphere", 321, Rarity.UNCOMMON, mage.cards.w.WoodenSphere.class));
        cards.add(new SetCardInfo("Worship", 57, Rarity.RARE, mage.cards.w.Worship.class));
        cards.add(new SetCardInfo("Wrath of God", 58, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Wrath of Marit Lage", 115, Rarity.UNCOMMON, mage.cards.w.WrathOfMaritLage.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", 290, Rarity.UNCOMMON, mage.cards.y.YavimayaEnchantress.class));
        cards.add(new SetCardInfo("Zombify", 174, Rarity.UNCOMMON, mage.cards.z.Zombify.class));
        cards.add(new SetCardInfo("Zur's Weirding", 116, Rarity.RARE, mage.cards.z.ZursWeirding.class));
    }

    @Override
    protected List<CardInfo> findCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findCardsByRarity(rarity);
        // card numbers containing S are Starter Set cards not found in boosters
        cardInfos.removeIf(cardInfo -> cardInfo.getCardNumber().contains("S"));
        return cardInfos;
    }
}