package gregtech.loaders.recipe;

import gregtech.api.GTValues;
import gregtech.api.items.OreDictNames;
import gregtech.api.metatileentity.ITieredMetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockFusionCoil;
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.BlockMultiblockCasing.MultiblockCasingType;
import gregtech.common.blocks.BlockWireCoil.CoilType;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType.*;
import static gregtech.common.blocks.BlockFireboxCasing.FireboxCasingType.*;
import static gregtech.common.blocks.BlockMachineCasing.MachineCasingType.*;
import static gregtech.common.blocks.BlockMetalCasing.MetalCasingType.*;
import static gregtech.common.blocks.BlockMultiblockCasing.MultiblockCasingType.*;
import static gregtech.common.blocks.BlockSteamCasing.SteamCasingType.*;
import static gregtech.common.blocks.BlockTurbineCasing.TurbineCasingType.*;
import static gregtech.common.blocks.BlockWarningSign.SignType.*;
import static gregtech.common.blocks.BlockWireCoil.CoilType.CUPRONICKEL;
import static gregtech.loaders.recipe.CraftingComponent.*;

public class MetaTileEntityLoader {

    public static void init() {

        ModHandler.addShapedRecipe("casing_ulv", MetaBlocks.MACHINE_CASING.getItemVariant(ULV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.WroughtIron));
        ModHandler.addShapedRecipe("casing_lv", MetaBlocks.MACHINE_CASING.getItemVariant(LV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel));
        ModHandler.addShapedRecipe("casing_mv", MetaBlocks.MACHINE_CASING.getItemVariant(MV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Aluminium));
        ModHandler.addShapedRecipe("casing_hv", MetaBlocks.MACHINE_CASING.getItemVariant(HV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel));
        ModHandler.addShapedRecipe("casing_ev", MetaBlocks.MACHINE_CASING.getItemVariant(EV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium));
        ModHandler.addShapedRecipe("casing_iv", MetaBlocks.MACHINE_CASING.getItemVariant(IV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel));
        ModHandler.addShapedRecipe("casing_luv", MetaBlocks.MACHINE_CASING.getItemVariant(LuV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Chrome));
        ModHandler.addShapedRecipe("casing_zpm", MetaBlocks.MACHINE_CASING.getItemVariant(ZPM), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Iridium));
        ModHandler.addShapedRecipe("casing_uv", MetaBlocks.MACHINE_CASING.getItemVariant(UV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Osmium));
        ModHandler.addShapedRecipe("casing_max", MetaBlocks.MACHINE_CASING.getItemVariant(MAX), "PPP", "PwP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Neutronium));

        ModHandler.addShapedRecipe("casing_primitive_bricks", MetaBlocks.METAL_CASING.getItemVariant(PRIMITIVE_BRICKS, 1), "XX", "XX", 'X', MetaItems.FIRECLAY_BRICK);
        ModHandler.addShapedRecipe("casing_coke_bricks", MetaBlocks.METAL_CASING.getItemVariant(COKE_BRICKS, 1), "XX", "XX", 'X', MetaItems.COKE_OVEN_BRICK);
        ModHandler.addShapedRecipe("casing_bronze_bricks", MetaBlocks.METAL_CASING.getItemVariant(BRONZE_BRICKS, 2), "PhP", "PBP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'B', new ItemStack(Blocks.BRICK_BLOCK, 1));
        ModHandler.addShapedRecipe("casing_steel_solid", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Steel));
        ModHandler.addShapedRecipe("casing_titanium_stable", MetaBlocks.METAL_CASING.getItemVariant(TITANIUM_STABLE, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Titanium));
        ModHandler.addShapedRecipe("casing_invar_heatproof", MetaBlocks.METAL_CASING.getItemVariant(INVAR_HEATPROOF, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Invar), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Invar));
        ModHandler.addShapedRecipe("casing_aluminium_frostproof", MetaBlocks.METAL_CASING.getItemVariant(ALUMINIUM_FROSTPROOF, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Aluminium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Aluminium));
        ModHandler.addShapedRecipe("casing_stainless_clean", MetaBlocks.METAL_CASING.getItemVariant(STAINLESS_CLEAN, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.StainlessSteel));
        ModHandler.addShapedRecipe("casing_tungstensteel_robust", MetaBlocks.METAL_CASING.getItemVariant(TUNGSTENSTEEL_ROBUST, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.TungstenSteel));

        ModHandler.addShapedRecipe("casing_steel_turbine_casing", MetaBlocks.TURBINE_CASING.getItemVariant(STEEL_TURBINE_CASING, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Magnalium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.BlueSteel));
        ModHandler.addShapedRecipe("casing_stainless_turbine_casing", MetaBlocks.TURBINE_CASING.getItemVariant(STAINLESS_TURBINE_CASING, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'F', MetaBlocks.TURBINE_CASING.getItemVariant(STEEL_TURBINE_CASING));
        ModHandler.addShapedRecipe("casing_titanium_turbine_casing", MetaBlocks.TURBINE_CASING.getItemVariant(TITANIUM_TURBINE_CASING, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'F', MetaBlocks.TURBINE_CASING.getItemVariant(STEEL_TURBINE_CASING));
        ModHandler.addShapedRecipe("casing_tungstensteel_turbine_casing", MetaBlocks.TURBINE_CASING.getItemVariant(TUNGSTENSTEEL_TURBINE_CASING, 2), "PhP", "PFP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'F', MetaBlocks.TURBINE_CASING.getItemVariant(STEEL_TURBINE_CASING));

        ModHandler.addShapedRecipe("casing_bronze_pipe", MetaBlocks.BOILER_CASING.getItemVariant(BRONZE_PIPE, 2), "PIP", "IFI", "PIP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Bronze), 'I', new UnificationEntry(OrePrefix.pipeMedium, Materials.Bronze));
        ModHandler.addShapedRecipe("casing_steel_pipe", MetaBlocks.BOILER_CASING.getItemVariant(STEEL_PIPE, 2), "PIP", "IFI", "PIP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Steel), 'I', new UnificationEntry(OrePrefix.pipeMedium, Materials.Steel));
        ModHandler.addShapedRecipe("casing_titanium_pipe", MetaBlocks.BOILER_CASING.getItemVariant(TITANIUM_PIPE, 2), "PIP", "IFI", "PIP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Titanium), 'I', new UnificationEntry(OrePrefix.pipeMedium, Materials.Titanium));
        ModHandler.addShapedRecipe("casing_tungstensteel_pipe", MetaBlocks.BOILER_CASING.getItemVariant(TUNGSTENSTEEL_PIPE, 2), "PIP", "IFI", "PIP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.TungstenSteel), 'I', new UnificationEntry(OrePrefix.pipeMedium, Materials.TungstenSteel));
        ModHandler.addShapedRecipe("casing_ptfe_pipe", MetaBlocks.BOILER_CASING.getItemVariant(POLYTETRAFLUOROETHYLENE_PIPE, 2), "PIP", "IFI", "PIP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Polytetrafluoroethylene), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Polytetrafluoroethylene), 'I', new UnificationEntry(OrePrefix.pipeMedium, Materials.Polytetrafluoroethylene));
        ModHandler.addShapedRecipe("casing_bronze_firebox", MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(BRONZE_FIREBOX, 2), "PSP", "SFS", "PSP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Bronze), 'S', new UnificationEntry(OrePrefix.stick, Materials.Bronze));
        ModHandler.addShapedRecipe("casing_steel_firebox", MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(STEEL_FIREBOX, 2), "PSP", "SFS", "PSP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Steel), 'S', new UnificationEntry(OrePrefix.stick, Materials.Steel));
        ModHandler.addShapedRecipe("casing_titanium_firebox", MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(TITANIUM_FIREBOX, 2), "PSP", "SFS", "PSP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Titanium), 'S', new UnificationEntry(OrePrefix.stick, Materials.Titanium));
        ModHandler.addShapedRecipe("casing_tungstensteel_firebox", MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(TUNGSTENSTEEL_FIREBOX, 2), "PSP", "SFS", "PSP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.TungstenSteel), 'S', new UnificationEntry(OrePrefix.stick, Materials.TungstenSteel));

        for (CoilType coilType : CoilType.values()) {
            if (coilType.getMaterial() != null) {
                ItemStack outputStack = MetaBlocks.WIRE_COIL.getItemVariant(coilType);
                ModHandler.addShapedRecipe(String.format("heating_coil_%s", coilType.getName()), outputStack, "XXX", "XwX", "XXX", 'X',
                    new UnificationEntry(OrePrefix.wireGtDouble, coilType.getMaterial()));
            }
        }

        ModHandler.addShapedRecipe("casing_bronze_gearbox", MetaBlocks.TURBINE_CASING.getItemVariant(BRONZE_GEARBOX, 2), "PhP", "GFG", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Bronze), 'G', new UnificationEntry(OrePrefix.gear, Materials.Bronze));
        ModHandler.addShapedRecipe("casing_steel_gearbox", MetaBlocks.TURBINE_CASING.getItemVariant(STEEL_GEARBOX, 2), "PhP", "GFG", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Steel), 'G', new UnificationEntry(OrePrefix.gear, Materials.Steel));
        ModHandler.addShapedRecipe("casing_titanium_gearbox", MetaBlocks.TURBINE_CASING.getItemVariant(TITANIUM_GEARBOX, 2), "PhP", "GFG", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Titanium), 'G', new UnificationEntry(OrePrefix.gear, Materials.Titanium));

        ModHandler.addShapedRecipe("casing_grate_casing", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(GRATE_CASING, 2), "PVP", "PFP", "PMP", 'P', new ItemStack(Blocks.IRON_BARS, 1), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.Steel), 'M', MetaItems.ELECTRIC_MOTOR_MV, 'V', new UnificationEntry(OrePrefix.rotor, Materials.Steel));
        ModHandler.addShapedRecipe("casing_assembler_casing", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(ASSEMBLER_CASING, 2), "CCC", "CFC", "CMC", 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Elite), 'F', new UnificationEntry(OrePrefix.frameGt, Materials.TungstenSteel), 'M', MetaItems.ELECTRIC_MOTOR_IV);
        ModHandler.addShapedRecipe("casing_assembly_line", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(ASSEMBLY_LINE_CASING, 2), "PhP", "AFA", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'A', MetaItems.ROBOT_ARM_IV.getStackForm(), 'F', OreDictUnifier.get(OrePrefix.frameGt, Materials.TungstenSteel));

        ModHandler.addShapedRecipe("casing_fusion_mk1", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(FUSION_CASING), "PhP", "PCP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'C', MetaBlocks.MACHINE_CASING.getItemVariant(LuV));
        ModHandler.addShapedRecipe("casing_fusion_mk2", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(FUSION_CASING_MK2), "PhP", "PCP", "PwP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Americium), 'C', MetaBlocks.MULTIBLOCK_CASING.getItemVariant(FUSION_CASING));

        ModHandler.addShapedRecipe("heating_coil_fusion", MetaBlocks.FUSION_COIL.getItemVariant(BlockFusionCoil.CoilType.FUSION_COIL), "CNC", "FKF", "CNC", 'C', new UnificationEntry(OrePrefix.circuit, Tier.Master), 'N', MetaItems.NEUTRON_REFLECTOR, 'F', MetaItems.FIELD_GENERATOR_MV, 'K', MetaBlocks.FUSION_COIL.getItemVariant(BlockFusionCoil.CoilType.SUPERCONDUCTOR));

        ModHandler.addShapedRecipe("warning_sign_yellow_stripes", MetaBlocks.WARNING_SIGN.getItemVariant(YELLOW_STRIPES), "Y  ", " M ", "  B", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_small_yellow_stripes", MetaBlocks.WARNING_SIGN.getItemVariant(SMALL_YELLOW_STRIPES), "  Y", " M ", "B  ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_radioactive_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(RADIOACTIVE_HAZARD), " YB", " M ", "   ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_bio_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(BIO_HAZARD), " Y ", " MB", "   ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_explosion_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(EXPLOSION_HAZARD), " Y ", " M ", "  B", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_fire_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(FIRE_HAZARD), " Y ", " M ", " B ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_acid_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(ACID_HAZARD), " Y ", " M ", "B  ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_magic_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(MAGIC_HAZARD), " Y ", "BM ", "   ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_frost_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(FROST_HAZARD), "BY ", " M ", "   ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");
        ModHandler.addShapedRecipe("warning_sign_noise_hazard", MetaBlocks.WARNING_SIGN.getItemVariant(NOISE_HAZARD), "   ", " M ", "BY ", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'Y', "dyeYellow", 'B', "dyeBlack");

        ModHandler.addShapelessRecipe("yellow_stripes_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(YELLOW_STRIPES));
        ModHandler.addShapelessRecipe("small_yellow_stripes_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(SMALL_YELLOW_STRIPES));
        ModHandler.addShapelessRecipe("radioactive_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(RADIOACTIVE_HAZARD));
        ModHandler.addShapelessRecipe("bio_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(BIO_HAZARD));
        ModHandler.addShapelessRecipe("explosion_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(EXPLOSION_HAZARD));
        ModHandler.addShapelessRecipe("fire_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(FIRE_HAZARD));
        ModHandler.addShapelessRecipe("acid_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(ACID_HAZARD));
        ModHandler.addShapelessRecipe("magic_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(MAGIC_HAZARD));
        ModHandler.addShapelessRecipe("frost_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(FROST_HAZARD));
        ModHandler.addShapelessRecipe("noise_hazard_to_steel_solid_casing", MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), MetaBlocks.WARNING_SIGN.getItemVariant(NOISE_HAZARD));

        if (ConfigHolder.harderMachineHulls) {
            ModHandler.addShapedRecipe("hull_ulv", MetaTileEntities.HULL[GTValues.ULV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(ULV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.RedAlloy), 'H', new UnificationEntry(OrePrefix.plate, Materials.WroughtIron), 'P', new UnificationEntry(OrePrefix.plate, Materials.Wood));
            ModHandler.addShapedRecipe("hull_lv", MetaTileEntities.HULL[GTValues.LV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(LV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin), 'H', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'P', new UnificationEntry(OrePrefix.plate, Materials.WroughtIron));
            ModHandler.addShapedRecipe("hull_mv", MetaTileEntities.HULL[GTValues.MV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(MV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper), 'H', new UnificationEntry(OrePrefix.plate, Materials.Aluminium), 'P', new UnificationEntry(OrePrefix.plate, Materials.WroughtIron));
            ModHandler.addShapedRecipe("hull_hv", MetaTileEntities.HULL[GTValues.HV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(HV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'H', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polyethylene));
            ModHandler.addShapedRecipe("hull_ev", MetaTileEntities.HULL[GTValues.EV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(EV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium), 'H', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polyethylene));
            ModHandler.addShapedRecipe("hull_iv", MetaTileEntities.HULL[GTValues.IV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(IV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten), 'H', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polytetrafluoroethylene));
            ModHandler.addShapedRecipe("hull_luv", MetaTileEntities.HULL[GTValues.LuV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(LuV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium), 'H', new UnificationEntry(OrePrefix.plate, Materials.Chrome), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polytetrafluoroethylene));
            ModHandler.addShapedRecipe("hull_zpm", MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(ZPM), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah), 'H', new UnificationEntry(OrePrefix.plate, Materials.Iridium), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polybenzimidazole));
            ModHandler.addShapedRecipe("hull_uv", MetaTileEntities.HULL[GTValues.UV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(UV), 'C', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy), 'H', new UnificationEntry(OrePrefix.plate, Materials.Osmium), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polybenzimidazole));
            ModHandler.addShapedRecipe("hull_max", MetaTileEntities.HULL[GTValues.MAX].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(MAX), 'C', new UnificationEntry(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor), 'H', new UnificationEntry(OrePrefix.plate, Materials.Darmstadtium), 'P', new UnificationEntry(OrePrefix.plate, Materials.Polybenzimidazole));
        } else {
            ModHandler.addShapedRecipe("hull_ulv", MetaTileEntities.HULL[GTValues.ULV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(ULV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.RedAlloy));
            ModHandler.addShapedRecipe("hull_lv", MetaTileEntities.HULL[GTValues.LV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(LV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
            ModHandler.addShapedRecipe("hull_mv", MetaTileEntities.HULL[GTValues.MV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(MV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper));
            ModHandler.addShapedRecipe("hull_hv", MetaTileEntities.HULL[GTValues.HV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(HV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold));
            ModHandler.addShapedRecipe("hull_ev", MetaTileEntities.HULL[GTValues.EV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(EV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium));
            ModHandler.addShapedRecipe("hull_iv", MetaTileEntities.HULL[GTValues.IV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(IV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten));
            ModHandler.addShapedRecipe("hull_luv", MetaTileEntities.HULL[GTValues.LuV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(LuV), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium));
            ModHandler.addShapedRecipe("hull_zpm", MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(ZPM), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah));
            ModHandler.addShapedRecipe("hull_uv", MetaTileEntities.HULL[GTValues.UV].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(UV), 'C', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy));
            ModHandler.addShapedRecipe("hull_max", MetaTileEntities.HULL[GTValues.MAX].getStackForm(), "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(MAX), 'C', new UnificationEntry(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor));
        }

        ModHandler.addShapedRecipe("transformer_lv", MetaTileEntities.TRANSFORMER[GTValues.LV - 1].getStackForm(), " BB", "CM ", " BB", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Lead));
        ModHandler.addShapedRecipe("transformer_mv", MetaTileEntities.TRANSFORMER[GTValues.MV - 1].getStackForm(), " BB", "CM ", " BB", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
        ModHandler.addShapedRecipe("transformer_hv", MetaTileEntities.TRANSFORMER[GTValues.HV - 1].getStackForm(), " BB", "CM ", " BB", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper));
        ModHandler.addShapedRecipe("transformer_ev", MetaTileEntities.TRANSFORMER[GTValues.EV - 1].getStackForm(), "KBB", "CM ", "KBB", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'K', MetaItems.SMALL_COIL);
        ModHandler.addShapedRecipe("transformer_iv", MetaTileEntities.TRANSFORMER[GTValues.IV - 1].getStackForm(), "KBB", "CM ", "KBB", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium), 'K', MetaItems.SMALL_COIL);
        ModHandler.addShapedRecipe("transformer_luv", MetaTileEntities.TRANSFORMER[GTValues.LuV - 1].getStackForm(), "KBB", "CM ", "KBB", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten), 'K', MetaItems.POWER_INTEGRATED_CIRCUIT);
        ModHandler.addShapedRecipe("transformer_zpm", MetaTileEntities.TRANSFORMER[GTValues.ZPM - 1].getStackForm(), "KBB", "CM ", "KBB", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium), 'K', MetaItems.POWER_INTEGRATED_CIRCUIT);
        ModHandler.addShapedRecipe("transformer_uv", MetaTileEntities.TRANSFORMER[GTValues.UV - 1].getStackForm(), "KBB", "CM ", "KBB", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'C', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy), 'B', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah), 'K', MetaItems.POWER_INTEGRATED_CIRCUIT);

        ModHandler.addShapedRecipe("energy_output_hatch_ulv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.ULV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Lead));
        ModHandler.addShapedRecipe("energy_output_hatch_lv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.LV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
        ModHandler.addShapedRecipe("energy_output_hatch_mv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.MV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper));
        ModHandler.addShapedRecipe("energy_output_hatch_hv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.HV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold));
        ModHandler.addShapedRecipe("energy_output_hatch_ev", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.EV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium));
        ModHandler.addShapedRecipe("energy_output_hatch_iv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.IV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten));
        ModHandler.addShapedRecipe("energy_output_hatch_luv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.LuV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium));
        ModHandler.addShapedRecipe("energy_output_hatch_zpm", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.ZPM].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah));
        ModHandler.addShapedRecipe("energy_output_hatch_uv", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.UV].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'C', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy));
        ModHandler.addShapedRecipe("energy_output_hatch_max", MetaTileEntities.ENERGY_OUTPUT_HATCH[GTValues.MAX].getStackForm(), " MC", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'C', new UnificationEntry(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor));

        ModHandler.addShapedRecipe("energy_input_hatch_ulv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.ULV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Lead));
        ModHandler.addShapedRecipe("energy_input_hatch_lv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.LV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
        ModHandler.addShapedRecipe("energy_input_hatch_mv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.MV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper));
        ModHandler.addShapedRecipe("energy_input_hatch_hv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.HV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold));
        ModHandler.addShapedRecipe("energy_input_hatch_ev", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.EV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium));
        ModHandler.addShapedRecipe("energy_input_hatch_iv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.IV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tungsten));
        ModHandler.addShapedRecipe("energy_input_hatch_luv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.LuV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.VanadiumGallium));
        ModHandler.addShapedRecipe("energy_input_hatch_zpm", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.ZPM].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Naquadah));
        ModHandler.addShapedRecipe("energy_input_hatch_uv", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.UV].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'C', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy));
        ModHandler.addShapedRecipe("energy_input_hatch_max", MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.MAX].getStackForm(), "CM ", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'C', new UnificationEntry(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor));

        ModHandler.addShapedRecipe("fluid_import_hatch_ulv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.ULV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_lv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_mv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.MV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_hv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.HV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_ev", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.EV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_iv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.IV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_luv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LuV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_zpm", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.ZPM].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_uv", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.UV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_import_hatch_max", MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.UHV].getStackForm(), "G", "M", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'G', new ItemStack(Blocks.GLASS));

        ModHandler.addShapedRecipe("fluid_export_hatch_ulv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.ULV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_lv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.LV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_mv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.MV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_hv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.HV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_ev", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.EV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_iv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.IV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("fluid_export_hatch_luv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.LuV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_export_hatch_zpm", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.ZPM].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_export_hatch_uv", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.UV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("fluid_export_hatch_max", MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.UHV].getStackForm(), "M", "G", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'G', new ItemStack(Blocks.GLASS));

        ModHandler.addShapedRecipe("item_import_bus_ulv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.ULV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_lv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_mv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.MV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_hv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.HV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_ev", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.EV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_iv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.IV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_luv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LuV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_zpm", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.ZPM].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_uv", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.UV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_import_bus_max", MetaTileEntities.ITEM_IMPORT_BUS[GTValues.UHV].getStackForm(), "C", "M", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'C', OreDictNames.chestWood);

        ModHandler.addShapedRecipe("item_export_bus_ulv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.ULV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_lv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_mv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.MV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_hv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.HV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_ev", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.EV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_iv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.IV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_luv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LuV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_zpm", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.ZPM].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_uv", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.UV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'C', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("item_export_bus_max", MetaTileEntities.ITEM_EXPORT_BUS[GTValues.UHV].getStackForm(), "M", "C", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'C', OreDictNames.chestWood);

        ModHandler.addShapedRecipe("battery_buffer_ulv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.ULV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Lead), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_lv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.LV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Tin), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_mv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.MV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Copper), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_hv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.HV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Gold), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_ev_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.EV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Aluminium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_iv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.IV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Tungsten), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_luv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.LuV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.VanadiumGallium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_zpm_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.ZPM][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.Naquadah), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_uv_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.UV][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, Materials.NaquadahAlloy), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_max_1x1", MetaTileEntities.BATTERY_BUFFER[GTValues.MAX][0].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtSingle, MarkerMaterials.Tier.Superconductor), 'T', OreDictNames.chestWood);

        ModHandler.addShapedRecipe("battery_buffer_ulv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.ULV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Lead), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_lv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.LV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Tin), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_mv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.MV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Copper), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_hv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.HV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Gold), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_ev_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.EV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Aluminium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_iv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.IV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Tungsten), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_luv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.LuV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.VanadiumGallium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_zpm_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.ZPM][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Naquadah), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_uv_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.UV][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.NaquadahAlloy), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_max_2x2", MetaTileEntities.BATTERY_BUFFER[GTValues.MAX][1].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtQuadruple, MarkerMaterials.Tier.Superconductor), 'T', OreDictNames.chestWood);

        ModHandler.addShapedRecipe("battery_buffer_ulv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.ULV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Lead), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_lv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.LV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Tin), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_mv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.MV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Copper), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_hv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.HV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Gold), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_ev_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.EV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Aluminium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_iv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.IV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Tungsten), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_luv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.LuV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.VanadiumGallium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_zpm_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.ZPM][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.Naquadah), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_uv_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.UV][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, Materials.NaquadahAlloy), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_max_3x3", MetaTileEntities.BATTERY_BUFFER[GTValues.MAX][2].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtOctal, MarkerMaterials.Tier.Superconductor), 'T', OreDictNames.chestWood);

        ModHandler.addShapedRecipe("battery_buffer_ulv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.ULV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Lead), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_lv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.LV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Tin), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_mv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.MV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Copper), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_hv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.HV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Gold), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_ev_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.EV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Aluminium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_iv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.IV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Tungsten), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_luv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.LuV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.VanadiumGallium), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_zpm_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.ZPM][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Naquadah), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_uv_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.UV][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.NaquadahAlloy), 'T', OreDictNames.chestWood);
        ModHandler.addShapedRecipe("battery_buffer_max_4x4", MetaTileEntities.BATTERY_BUFFER[GTValues.MAX][3].getStackForm(), "WTW", "WMW", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, MarkerMaterials.Tier.Superconductor), 'T', OreDictNames.chestWood);

        ItemStack last_bat = (ConfigHolder.U.GT5u.replaceUVwithMAXBat ? MetaItems.MAX_BATTERY : MetaItems.ZPM2).getStackForm();
        List<ItemStack> batteries = new ArrayList<ItemStack>() {{
            add(ConfigHolder.U.GT5u.enableZPMandUVBats ? MetaItems.ENERGY_MODULE.getStackForm() : MetaItems.ENERGY_LAPOTRONIC_ORB2.getStackForm());
            add(ConfigHolder.U.GT5u.enableZPMandUVBats ? MetaItems.ENERGY_CLUSTER.getStackForm() : last_bat);
            add(last_bat);
        }};
        ModHandler.addShapedRecipe("charger_ulv", MetaTileEntities.CHARGER[GTValues.ULV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.ULV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Lead), 'T', OreDictNames.chestWood, 'B', MetaItems.BATTERY_RE_ULV_TANTALUM, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Primitive));
        ModHandler.addShapedRecipe("charger_lv", MetaTileEntities.CHARGER[GTValues.LV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Tin), 'T', OreDictNames.chestWood, 'B', MetaItems.BATTERY_RE_LV_LITHIUM, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic));
        ModHandler.addShapedRecipe("charger_mv", MetaTileEntities.CHARGER[GTValues.MV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Copper), 'T', OreDictNames.chestWood, 'B', MetaItems.BATTERY_RE_MV_LITHIUM, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Good));
        ModHandler.addShapedRecipe("charger_hv", MetaTileEntities.CHARGER[GTValues.HV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Gold), 'T', OreDictNames.chestWood, 'B', MetaItems.BATTERY_RE_HV_LITHIUM, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced));
        ModHandler.addShapedRecipe("charger_ev", MetaTileEntities.CHARGER[GTValues.EV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Aluminium), 'T', OreDictNames.chestWood, 'B', MetaItems.LAPOTRON_CRYSTAL, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Extreme));
        ModHandler.addShapedRecipe("charger_iv", MetaTileEntities.CHARGER[GTValues.IV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Tungsten), 'T', OreDictNames.chestWood, 'B', MetaItems.ENERGY_LAPOTRONIC_ORB, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Elite));
        ModHandler.addShapedRecipe("charger_luv", MetaTileEntities.CHARGER[GTValues.LuV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.VanadiumGallium), 'T', OreDictNames.chestWood, 'B', MetaItems.ENERGY_LAPOTRONIC_ORB2, 'C', new UnificationEntry(OrePrefix.circuit, Tier.Master));
        ModHandler.addShapedRecipe("charger_zpm", MetaTileEntities.CHARGER[GTValues.ZPM].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Naquadah), 'T', OreDictNames.chestWood, 'B', batteries.get(0), 'C', new UnificationEntry(OrePrefix.circuit, Tier.Ultimate));
        ModHandler.addShapedRecipe("charger_uv", MetaTileEntities.CHARGER[GTValues.UV].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.UV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.NaquadahAlloy), 'T', OreDictNames.chestWood, 'B', batteries.get(1), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor));
        ModHandler.addShapedRecipe("charger_max", MetaTileEntities.CHARGER[GTValues.MAX].getStackForm(), "WTW", "WMW", "BCB", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, MarkerMaterials.Tier.Superconductor), 'T', OreDictNames.chestWood, 'B', batteries.get(2), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Infinite));

        ModHandler.addShapedRecipe("rotor_holder_hv", MetaTileEntities.ROTOR_HOLDER[0].getStackForm(), "WHW", "WRW", "WWW", 'H', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.Gold), 'R', new UnificationEntry(OrePrefix.gear, Materials.StainlessSteel));
        ModHandler.addShapedRecipe("rotor_holder_luv", MetaTileEntities.ROTOR_HOLDER[1].getStackForm(), "WHW", "WRW", "WWW", 'H', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Materials.YttriumBariumCuprate), 'R', new UnificationEntry(OrePrefix.gear, Materials.Chrome));
        ModHandler.addShapedRecipe("rotor_holder_max", MetaTileEntities.ROTOR_HOLDER[2].getStackForm(), "WHW", "WRW", "WWW", 'H', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'W', new UnificationEntry(OrePrefix.wireGtHex, Tier.Superconductor), 'R', new UnificationEntry(OrePrefix.gear, Materials.HSSS));

        // STEAM MACHINES
        ModHandler.addShapedRecipe("bronze_hull", MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL), "PPP", "PhP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze));
        ModHandler.addShapedRecipe("bronze_bricks_hull", MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_BRICKS_HULL), "PPP", "PhP", "BBB", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'B', new ItemStack(Blocks.BRICK_BLOCK));
        ModHandler.addShapedRecipe("steel_hull", MetaBlocks.STEAM_CASING.getItemVariant(STEEL_HULL), "PPP", "PhP", "PPP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel));
        ModHandler.addShapedRecipe("steel_bricks_hull", MetaBlocks.STEAM_CASING.getItemVariant(STEEL_BRICKS_HULL), "PPP", "PhP", "BBB", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'B', new ItemStack(Blocks.BRICK_BLOCK));

        ModHandler.addShapedRecipe("steam_boiler_coal_bronze", MetaTileEntities.STEAM_BOILER_COAL_BRONZE.getStackForm(), "PPP", "P P", "BFB", 'F', OreDictNames.craftingFurnace, 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'B', new ItemStack(Blocks.BRICK_BLOCK));
        ModHandler.addShapedRecipe("steam_boiler_coal_steel", MetaTileEntities.STEAM_BOILER_COAL_STEEL.getStackForm(), "PPP", "P P", "BFB", 'F', OreDictNames.craftingFurnace, 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'B', new ItemStack(Blocks.BRICK_BLOCK));
        ModHandler.addShapedRecipe("steam_boiler_lava_bronze", MetaTileEntities.STEAM_BOILER_LAVA_BRONZE.getStackForm(), "PPP", "GGG", "PMP", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_BRICKS_HULL), 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("steam_boiler_lava_steel", MetaTileEntities.STEAM_BOILER_LAVA_STEEL.getStackForm(), "PPP", "GGG", "PMP", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_BRICKS_HULL), 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'G', new ItemStack(Blocks.GLASS, 1));
        ModHandler.addShapedRecipe("steam_boiler_solar_bronze", MetaTileEntities.STEAM_BOILER_SOLAR_BRONZE.getStackForm(), "GGG", "SSS", "PMP", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_BRICKS_HULL), 'P', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'S', new UnificationEntry(OrePrefix.plate, Materials.Silver), 'G', new ItemStack(Blocks.GLASS));

        ModHandler.addShapedRecipe("steam_furnace_bronze", MetaTileEntities.STEAM_FURNACE_BRONZE.getStackForm(), "XXX", "XMX", "XFX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_BRICKS_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'F', OreDictNames.craftingFurnace);
        ModHandler.addShapedRecipe("steam_furnace_steel", MetaTileEntities.STEAM_FURNACE_STEEL.getStackForm(), "XXX", "XMX", "XFX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_BRICKS_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'F', OreDictNames.craftingFurnace);
        ModHandler.addShapedRecipe("steam_macerator_bronze", MetaTileEntities.STEAM_MACERATOR_BRONZE.getStackForm(), "DXD", "XMX", "PXP", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'P', OreDictNames.craftingPiston, 'D', new UnificationEntry(OrePrefix.gem, Materials.Diamond));
        ModHandler.addShapedRecipe("steam_macerator_steel", MetaTileEntities.STEAM_MACERATOR_STEEL.getStackForm(), "DXD", "XMX", "PXP", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'P', OreDictNames.craftingPiston, 'D', new UnificationEntry(OrePrefix.gem, Materials.Diamond));
        ModHandler.addShapedRecipe("steam_extractor_bronze", MetaTileEntities.STEAM_EXTRACTOR_BRONZE.getStackForm(), "XXX", "PMG", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'P', OreDictNames.craftingPiston, 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("steam_extractor_steel", MetaTileEntities.STEAM_EXTRACTOR_STEEL.getStackForm(), "XXX", "PMG", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'P', OreDictNames.craftingPiston, 'G', new ItemStack(Blocks.GLASS));
        ModHandler.addShapedRecipe("steam_hammer_bronze", MetaTileEntities.STEAM_HAMMER_BRONZE.getStackForm(), "XPX", "XMX", "XAX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'P', OreDictNames.craftingPiston, 'A', OreDictNames.craftingAnvil);
        ModHandler.addShapedRecipe("steam_hammer_steel", MetaTileEntities.STEAM_HAMMER_STEEL.getStackForm(), "XPX", "XMX", "XAX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'P', OreDictNames.craftingPiston, 'A', OreDictNames.craftingAnvil);
        ModHandler.addShapedRecipe("steam_compressor_bronze", MetaTileEntities.STEAM_COMPRESSOR_BRONZE.getStackForm(), "XXX", "PMP", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'P', OreDictNames.craftingPiston);
        ModHandler.addShapedRecipe("steam_compressor_steel", MetaTileEntities.STEAM_COMPRESSOR_STEEL.getStackForm(), "XXX", "PMP", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'P', OreDictNames.craftingPiston);
        ModHandler.addShapedRecipe("steam_alloy_smelter_bronze", MetaTileEntities.STEAM_ALLOY_SMELTER_BRONZE.getStackForm(), "XXX", "FMF", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_BRICKS_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Bronze), 'F', OreDictNames.craftingFurnace);
        ModHandler.addShapedRecipe("steam_alloy_smelter_steel", MetaTileEntities.STEAM_ALLOY_SMELTER_STEEL.getStackForm(), "XXX", "FMF", "XXX", 'M', MetaBlocks.STEAM_CASING.getItemVariant(STEEL_BRICKS_HULL), 'X', new UnificationEntry(OrePrefix.pipeSmall, Materials.Steel), 'F', OreDictNames.craftingFurnace);

        // MULTI BLOCK CONTROLLERS
        ModHandler.addShapedRecipe("bronze_primitive_blast_furnace", MetaTileEntities.PRIMITIVE_BLAST_FURNACE.getStackForm(), "hRS", "PBR", "dRS", 'R', new UnificationEntry(OrePrefix.stick, Materials.Iron), 'S', new UnificationEntry(OrePrefix.screw, Materials.Iron), 'P', new UnificationEntry(OrePrefix.plate, Materials.Iron), 'B', MetaBlocks.METAL_CASING.getItemVariant(PRIMITIVE_BRICKS));
        ModHandler.addShapedRecipe("coke_oven", MetaTileEntities.COKE_OVEN.getStackForm(), "PIP", "IwI", "PIP", 'P', MetaBlocks.METAL_CASING.getItemVariant(MetalCasingType.COKE_BRICKS), 'I', new UnificationEntry(OrePrefix.plate, Materials.Iron));
        ModHandler.addShapelessRecipe("coke_oven_hatch", MetaTileEntities.COKE_OVEN_HATCH.getStackForm(), MetaBlocks.METAL_CASING.getItemVariant(MetalCasingType.COKE_BRICKS), MetaTileEntities.BRONZE_TANK.getStackForm());
        ModHandler.addShapedRecipe("electric_blast_furnace", MetaTileEntities.ELECTRIC_BLAST_FURNACE.getStackForm(), "FFF", "CMC", "WCW", 'M', MetaBlocks.METAL_CASING.getItemVariant(INVAR_HEATPROOF), 'F', OreDictNames.craftingFurnace, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
        ModHandler.addShapedRecipe("vacuum_freezer", MetaTileEntities.VACUUM_FREEZER.getStackForm(), "PPP", "CMC", "WCW", 'M', MetaBlocks.METAL_CASING.getItemVariant(ALUMINIUM_FROSTPROOF), 'P', MetaItems.ELECTRIC_PUMP_HV, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold));
        ModHandler.addShapedRecipe("implosion_compressor", MetaTileEntities.IMPLOSION_COMPRESSOR.getStackForm(), "OOO", "CMC", "WCW", 'M', MetaBlocks.METAL_CASING.getItemVariant(STEEL_SOLID), 'O', new UnificationEntry(OrePrefix.stone, Materials.Obsidian), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium));
        ModHandler.addShapedRecipe("distillation_tower", MetaTileEntities.DISTILLATION_TOWER.getStackForm(), "CBC", "FMF", "CBC", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'B', new UnificationEntry(OrePrefix.pipeLarge, Materials.StainlessSteel), 'C', new UnificationEntry(OrePrefix.circuit, Tier.Extreme), 'F', MetaItems.ELECTRIC_PUMP_EV);
        ModHandler.addShapedRecipe("cracking_unit", MetaTileEntities.CRACKER.getStackForm(), "CEC", "PHP", "CEC", 'C', MetaBlocks.WIRE_COIL.getItemVariant(CUPRONICKEL), 'E', MetaItems.ELECTRIC_PUMP_HV, 'P', new UnificationEntry(OrePrefix.circuit, Tier.Advanced), 'H', MetaTileEntities.HULL[GTValues.HV].getStackForm());

        ModHandler.addShapedRecipe("pyrolyse_oven", MetaTileEntities.PYROLYSE_OVEN.getStackForm(), "WEP", "EME", "WCP", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'W', MetaItems.ELECTRIC_PISTON_MV, 'P', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Cupronickel), 'E', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Good), 'C', MetaItems.ELECTRIC_PUMP_MV);
        ModHandler.addShapedRecipe("diesel_engine", MetaTileEntities.LARGE_COMBUSTION_ENGINE.getStackForm(), "PCP", "EME", "GWG", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'P', MetaItems.ELECTRIC_PISTON_EV, 'E', MetaItems.ELECTRIC_MOTOR_EV, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Extreme), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.TungstenSteel), 'G', new UnificationEntry(OrePrefix.gear, Materials.Titanium));
        ModHandler.addShapedRecipe("engine_intake_casing", MetaBlocks.MULTIBLOCK_CASING.getItemVariant(MultiblockCasingType.ENGINE_INTAKE_CASING, 2), "PhP", "RFR", "PwP", 'R', new UnificationEntry(OrePrefix.pipeMedium, Materials.Titanium), 'F', MetaBlocks.METAL_CASING.getItemVariant(TITANIUM_STABLE), 'P', new UnificationEntry(OrePrefix.rotor, Materials.Titanium));
        ModHandler.addShapedRecipe("multi_furnace", MetaTileEntities.MULTI_FURNACE.getStackForm(), "PPP", "ASA", "CAC", 'P', Blocks.FURNACE, 'A', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'S', MetaBlocks.METAL_CASING.getItemVariant(INVAR_HEATPROOF), 'C', new UnificationEntry(OrePrefix.cableGtSingle, Materials.AnnealedCopper));

        ModHandler.addShapedRecipe("large_steam_turbine", MetaTileEntities.LARGE_STEAM_TURBINE.getStackForm(), "PSP", "SAS", "CSC", 'S', new UnificationEntry(OrePrefix.gear, Materials.Steel), 'P', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'A', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'C', new UnificationEntry(OrePrefix.pipeLarge, Materials.Steel));
        ModHandler.addShapedRecipe("large_gas_turbine", MetaTileEntities.LARGE_GAS_TURBINE.getStackForm(), "PSP", "SAS", "CSC", 'S', new UnificationEntry(OrePrefix.gear, Materials.StainlessSteel), 'P', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Extreme), 'A', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'C', new UnificationEntry(OrePrefix.pipeLarge, Materials.StainlessSteel));
        ModHandler.addShapedRecipe("large_plasma_turbine", MetaTileEntities.LARGE_PLASMA_TURBINE.getStackForm(), "PSP", "SAS", "CSC", 'S', new UnificationEntry(OrePrefix.gear, Materials.TungstenSteel), 'P', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Master), 'A', MetaTileEntities.HULL[GTValues.LuV].getStackForm(), 'C', new UnificationEntry(OrePrefix.pipeLarge, Materials.TungstenSteel));

        ModHandler.addShapedRecipe("large_bronze_boiler", MetaTileEntities.LARGE_BRONZE_BOILER.getStackForm(), "PSP", "SAS", "PSP", 'P', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin), 'S', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic), 'A', MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(BRONZE_FIREBOX));
        ModHandler.addShapedRecipe("large_steel_boiler", MetaTileEntities.LARGE_STEEL_BOILER.getStackForm(), "PSP", "SAS", "PSP", 'P', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper), 'S', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'A', MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(STEEL_FIREBOX));
        ModHandler.addShapedRecipe("large_titanium_boiler", MetaTileEntities.LARGE_TITANIUM_BOILER.getStackForm(), "PSP", "SAS", "PSP", 'P', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'S', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Extreme), 'A', MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(TITANIUM_FIREBOX));
        ModHandler.addShapedRecipe("large_tungstensteel_boiler", MetaTileEntities.LARGE_TUNGSTENSTEEL_BOILER.getStackForm(), "PSP", "SAS", "PSP", 'P', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium), 'S', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Elite), 'A', MetaBlocks.BOILER_FIREBOX_CASING.getItemVariant(TUNGSTENSTEEL_FIREBOX));

        ModHandler.addShapedRecipe("assembly_line", MetaTileEntities.ASSEMBLY_LINE.getStackForm(), "CRC", "SAS", "CRC", 'A', MetaTileEntities.HULL[GTValues.IV].getStackForm(), 'R', MetaItems.ROBOT_ARM_IV, 'C', MetaBlocks.MULTIBLOCK_CASING.getItemVariant(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLER_CASING), 'S', new UnificationEntry(OrePrefix.circuit, Tier.Elite));

        ModHandler.addShapedRecipe("large_chemical_reactor", MetaTileEntities.LARGE_CHEMICAL_REACTOR.getStackForm(), "CRC", "PMP", "CHC", 'C', new UnificationEntry(OrePrefix.circuit, Tier.Advanced), 'R', OreDictUnifier.get(OrePrefix.rotor, Materials.StainlessSteel), 'P', OreDictUnifier.get(OrePrefix.pipeLarge, Materials.Polytetrafluoroethylene), 'M', MetaItems.ELECTRIC_MOTOR_HV.getStackForm(), 'H', MetaTileEntities.HULL[GTValues.HV].getStackForm());

        // GENERATORS
        ModHandler.addShapedRecipe("diesel_generator_lv", MetaTileEntities.COMBUSTION_GENERATOR[0].getStackForm(), "PCP", "EME", "GWG", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'P', MetaItems.ELECTRIC_PISTON_LV, 'E', MetaItems.ELECTRIC_MOTOR_LV, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin), 'G', new UnificationEntry(OrePrefix.gear, Materials.Steel));
        ModHandler.addShapedRecipe("diesel_generator_mv", MetaTileEntities.COMBUSTION_GENERATOR[1].getStackForm(), "PCP", "EME", "GWG", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'P', MetaItems.ELECTRIC_PISTON_MV, 'E', MetaItems.ELECTRIC_MOTOR_MV, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Good), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper), 'G', new UnificationEntry(OrePrefix.gear, Materials.Aluminium));
        ModHandler.addShapedRecipe("diesel_generator_hv", MetaTileEntities.COMBUSTION_GENERATOR[2].getStackForm(), "PCP", "EME", "GWG", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'P', MetaItems.ELECTRIC_PISTON_HV, 'E', MetaItems.ELECTRIC_MOTOR_HV, 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'G', new UnificationEntry(OrePrefix.gear, Materials.StainlessSteel));

        ModHandler.addShapedRecipe("gas_turbine_lv", MetaTileEntities.GAS_TURBINE[0].getStackForm(), "CRC", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_LV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Tin), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin));
        ModHandler.addShapedRecipe("gas_turbine_mv", MetaTileEntities.GAS_TURBINE[1].getStackForm(), "CRC", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_MV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Bronze), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Good), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper));
        ModHandler.addShapedRecipe("gas_turbine_hv", MetaTileEntities.GAS_TURBINE[2].getStackForm(), "CRC", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_HV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Steel), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold));

        ModHandler.addShapedRecipe("steam_turbine_lv", MetaTileEntities.STEAM_TURBINE[0].getStackForm(), "PCP", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.LV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_LV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Tin), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Basic), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin), 'P', new UnificationEntry(OrePrefix.pipeMedium, Materials.Bronze));
        ModHandler.addShapedRecipe("steam_turbine_mv", MetaTileEntities.STEAM_TURBINE[1].getStackForm(), "PCP", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.MV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_MV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Bronze), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Good), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper), 'P', new UnificationEntry(OrePrefix.pipeMedium, Materials.Steel));
        ModHandler.addShapedRecipe("steam_turbine_hv", MetaTileEntities.STEAM_TURBINE[2].getStackForm(), "PCP", "RMR", "EWE", 'M', MetaTileEntities.HULL[GTValues.HV].getStackForm(), 'E', MetaItems.ELECTRIC_MOTOR_HV, 'R', new UnificationEntry(OrePrefix.rotor, Materials.Steel), 'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.Advanced), 'W', new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold), 'P', new UnificationEntry(OrePrefix.pipeMedium, Materials.StainlessSteel));

        ModHandler.addShapedRecipe("workbench_bronze", MetaTileEntities.WORKBENCH.getStackForm(), "CWC", "PHP", "PhP", 'C', OreDictNames.chestWood, 'W', new ItemStack(Blocks.CRAFTING_TABLE), 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'H', MetaBlocks.STEAM_CASING.getItemVariant(BRONZE_HULL));

        ModHandler.addShapedRecipe("magic_energy_absorber", MetaTileEntities.MAGIC_ENERGY_ABSORBER.getStackForm(), "PCP", "PMP", "PCP", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(), 'P', MetaItems.SENSOR_EV, 'C', new UnificationEntry(OrePrefix.circuit, Tier.Extreme));

        // MACHINES
        registerMachineRecipe(MetaTileEntities.ALLOY_SMELTER, "ECE", "CMC", "WCW", 'M', HULL, 'E', CIRCUIT, 'W', CABLE, 'C', COIL_HEATING_DOUBLE);
        registerMachineRecipe(MetaTileEntities.ASSEMBLER, "ACA", "VMV", "WCW", 'M', HULL, 'V', CONVEYOR, 'A', ROBOT_ARM, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.BENDER, "PwP", "CMC", "EWE", 'M', HULL, 'E', MOTOR, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.CANNER, "WPW", "CMC", "GGG", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.COMPRESSOR, " C ", "PMP", "WCW", 'M', HULL, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.CUTTER, "WCG", "VMB", "CWE", 'M', HULL, 'E', MOTOR, 'V', CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS, 'B', OreDictNames.craftingDiamondBlade);
        registerMachineRecipe(MetaTileEntities.ELECTRIC_FURNACE, "ECE", "CMC", "WCW", 'M', HULL, 'E', CIRCUIT, 'W', CABLE, 'C', COIL_HEATING);
        registerMachineRecipe(MetaTileEntities.EXTRACTOR, "GCG", "EMP", "WCW", 'M', HULL, 'E', PISTON, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.EXTRUDER, "CCE", "XMP", "CCE", 'M', HULL, 'X', PISTON, 'E', CIRCUIT, 'P', PIPE_MEDIUM, 'C', COIL_HEATING_DOUBLE);
        registerMachineRecipe(MetaTileEntities.LATHE, "WCW", "EMD", "CWP", 'M', HULL, 'E', MOTOR, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE, 'D', DIAMOND);
        registerMachineRecipe(MetaTileEntities.MACERATOR, "PEG", "WWM", "CCW", 'M', HULL, 'E', MOTOR, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE, 'G', GRINDER);
        registerMachineRecipe(MetaTileEntities.MICROWAVE, "LWC", "LMR", "LEC", 'M', HULL, 'E', MOTOR, 'R', EMITTER, 'C', CIRCUIT, 'W', CABLE, 'L', new UnificationEntry(OrePrefix.plate, Materials.Lead));
        registerMachineRecipe(MetaTileEntities.WIREMILL, "EWE", "CMC", "EWE", 'M', HULL, 'E', MOTOR, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.CENTRIFUGE, "CEC", "WMW", "CEC", 'M', HULL, 'E', MOTOR, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.ELECTROLYZER, "IGI", "IMI", "CWC", 'M', HULL, 'C', CIRCUIT, 'W', CABLE, 'I', WIRE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.THERMAL_CENTRIFUGE, "CEC", "OMO", "WEW", 'M', HULL, 'E', MOTOR, 'C', CIRCUIT, 'W', CABLE, 'O', COIL_HEATING_DOUBLE);
        registerMachineRecipe(MetaTileEntities.ORE_WASHER, "RGR", "CEC", "WMW", 'M', HULL, 'R', ROTOR, 'E', MOTOR, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.PACKER, "BCB", "RMV", "WCW", 'M', HULL, 'R', ROBOT_ARM, 'V', CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'B', OreDictNames.chestWood);
        registerMachineRecipe(MetaTileEntities.UNPACKER, "BCB", "VMR", "WCW", 'M', HULL, 'R', ROBOT_ARM, 'V', CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'B', OreDictNames.chestWood);
        registerMachineRecipe(MetaTileEntities.CHEMICAL_REACTOR, "GRG", "WEW", "CMC", 'M', HULL, 'R', ROTOR, 'E', MOTOR, 'C', CIRCUIT, 'W', CABLE, 'G', PIPE_REACTOR);
        registerMachineRecipe(MetaTileEntities.FLUID_CANNER, "GCG", "GMG", "WPW", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.BREWERY, "GPG", "WMW", "CBC", 'M', HULL, 'P', PUMP, 'B', STICK_DISTILLATION, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.FERMENTER, "WPW", "GMG", "WCW", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.FLUID_EXTRACTOR, "GCG", "PME", "WCW", 'M', HULL, 'E', PISTON, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.FLUID_SOLIDIFIER, "PGP", "WMW", "CBC", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS, 'B', OreDictNames.chestWood);
        registerMachineRecipe(MetaTileEntities.DISTILLERY, "GBG", "CMC", "WPW", 'M', HULL, 'P', PUMP, 'B', STICK_DISTILLATION, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.CHEMICAL_BATH, "VGW", "PGV", "CMC", 'M', HULL, 'P', PUMP, 'V', CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.POLARIZER, "ZSZ", "WMW", "ZSZ", 'M', HULL, 'S', STICK_ELECTROMAGNETIC, 'Z', COIL_ELECTRIC, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.ELECTROMAGNETIC_SEPARATOR, "VWZ", "WMS", "CWZ", 'M', HULL, 'S', STICK_ELECTROMAGNETIC, 'Z', COIL_ELECTRIC, 'V', CONVEYOR, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.AUTOCLAVE, "IGI", "IMI", "CPC", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'I', PLATE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.MIXER, "GRG", "GEG", "CMC", 'M', HULL, 'E', MOTOR, 'R', ROTOR, 'C', CIRCUIT, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.LASER_ENGRAVER, "PEP", "CMC", "WCW", 'M', HULL, 'E', EMITTER, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.FORMING_PRESS, "WPW", "CMC", "WPW", 'M', HULL, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.FORGE_HAMMER, "WPW", "CMC", "WAW", 'M', HULL, 'P', PISTON, 'C', CIRCUIT, 'W', CABLE, 'A', OreDictNames.craftingAnvil);
        registerMachineRecipe(MetaTileEntities.FLUID_HEATER, "OGO", "PMP", "WCW", 'M', HULL, 'P', PUMP, 'O', COIL_HEATING_DOUBLE, 'C', CIRCUIT, 'W', CABLE, 'G', GLASS);
        registerMachineRecipe(MetaTileEntities.SIFTER, "WFW", "PMP", "CFC", 'M', HULL, 'P', PISTON, 'F', MetaItems.ITEM_FILTER, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.ARC_FURNACE, "WGW", "CMC", "PPP", 'M', HULL, 'P', PLATE, 'C', CIRCUIT, 'W', CABLE_QUAD, 'G', new UnificationEntry(OrePrefix.ingot, Materials.Graphite));
        registerMachineRecipe(MetaTileEntities.PLASMA_ARC_FURNACE, "WGW", "CMC", "TPT", 'M', HULL, 'P', PLATE, 'C', BETTER_CIRCUIT, 'W', CABLE_QUAD, 'T', PUMP, 'G', new UnificationEntry(OrePrefix.ingot, Materials.Graphite));
        registerMachineRecipe(MetaTileEntities.CLUSTER_MILL, "MMM", "CHC", "MMM", 'M', MOTOR, 'C', CIRCUIT, 'H', HULL);

        registerMachineRecipe(MetaTileEntities.PUMP, "WGW", "GMG", "TGT", 'M', HULL, 'W', CIRCUIT, 'G', PUMP, 'T', PIPE_LARGE);
        registerMachineRecipe(MetaTileEntities.FISHER, "WTW", "PMP", "TGT", 'M', HULL, 'W', CIRCUIT, 'G', PUMP, 'T', MOTOR, 'P', PISTON);
        registerMachineRecipe(MetaTileEntities.AIR_COLLECTOR, "WFW", "PHP", "WCW", 'W', Blocks.IRON_BARS, 'F', MetaItems.ITEM_FILTER, 'P', PUMP, 'H', HULL, 'C', CIRCUIT);
        registerMachineRecipe(MetaTileEntities.ITEM_COLLECTOR, "MRM", "RHR", "CWC", 'M', MOTOR, 'R', ROTOR, 'H', HULL, 'C', CIRCUIT, 'W', CABLE);
        registerMachineRecipe(MetaTileEntities.BLOCK_BREAKER, "MGM", "CHC", "WSW", 'M', MOTOR, 'H', HULL, 'C', CIRCUIT, 'W', CABLE, 'S', Blocks.CHEST, 'G', GRINDER);

        registerMachineRecipe(MetaTileEntities.QUANTUM_CHEST, "CPC", "PHP", "CFC", 'C', CIRCUIT, 'P', PLATE, 'F', FIELD_GENERATOR, 'H', HULL);
        registerMachineRecipe(MetaTileEntities.QUANTUM_TANK, "CFC", "PHP", "CPC", 'C', CIRCUIT, 'P', PLATE, 'F', FIELD_GENERATOR, 'H', HULL);

        ModHandler.addShapelessRecipe("small_wooden_chest", MetaTileEntities.SMALL_WOODEN_CHEST.getStackForm(8), "chest", 's');
        ModHandler.addShapelessRecipe("wooden_chest", MetaTileEntities.WOODEN_CHEST.getStackForm(), "chest", 'r');
        ModHandler.addShapedRecipe("bronze_chest", MetaTileEntities.BRONZE_CHEST.getStackForm(), "XXX", "X X", "XXX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Bronze));
        ModHandler.addShapedRecipe("steel_chest", MetaTileEntities.STEEL_CHEST.getStackForm(), "XXX", "X X", "XXX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Steel));
        ModHandler.addShapedRecipe("stainless_steel_chest", MetaTileEntities.STAINLESS_STEEL_CHEST.getStackForm(), "XXX", "X X", "XXX", 'X', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel));
        ModHandler.addShapedRecipe("titanium_chest", MetaTileEntities.TITANIUM_CHEST.getStackForm(), "XXX", "X X", "XXX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Titanium));
        ModHandler.addShapedRecipe("tungsten_steel_chest", MetaTileEntities.TUNGSTENSTEEL_CHEST.getStackForm(), "XXX", "X X", "XXX", 'X', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel));

        if (ConfigHolder.U.registerCrates) {
            ModHandler.addShapedRecipe("wooden_crate", MetaTileEntities.WOODEN_CRATE.getStackForm(), "RPR", "PsP", "RPR", 'P', "plankWood", 'R', new UnificationEntry(OrePrefix.screw, Materials.Iron));
            ModHandler.addShapedRecipe("bronze_crate", MetaTileEntities.BRONZE_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Bronze));
            ModHandler.addShapedRecipe("steel_crate", MetaTileEntities.STEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Steel));
            ModHandler.addShapedRecipe("stainless_steel_crate", MetaTileEntities.STAINLESS_STEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.StainlessSteel));
            ModHandler.addShapedRecipe("titanium_crate", MetaTileEntities.TITANIUM_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Titanium));
            ModHandler.addShapedRecipe("tungstensteel_crate", MetaTileEntities.TUNGSTENSTEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.TungstenSteel));
        }

        ModHandler.addShapedRecipe("wooden_tank", MetaTileEntities.WOODEN_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plank, Materials.Wood), 'Y', new UnificationEntry(OrePrefix.blockGlass));
        ModHandler.addShapedRecipe("bronze_tank", MetaTileEntities.BRONZE_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'Y', new UnificationEntry(OrePrefix.blockGlass));
        ModHandler.addShapedRecipe("steel_tank", MetaTileEntities.STEEL_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'Y', new UnificationEntry(OrePrefix.blockGlass));
        ModHandler.addShapedRecipe("stainless_steel_tank", MetaTileEntities.STAINLESS_STEEL_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'Y', new UnificationEntry(OrePrefix.blockGlass));
        ModHandler.addShapedRecipe("titanium_tank", MetaTileEntities.TITANIUM_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'Y', new UnificationEntry(OrePrefix.blockGlass));
        ModHandler.addShapedRecipe("tungsten_steel_tank", MetaTileEntities.TUNGSTENSTEEL_TANK.getStackForm(), "XYX", "Y Y", "XYX", 'X', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'Y', new UnificationEntry(OrePrefix.blockGlass));

        if (ConfigHolder.U.registerDrums) {
            ModHandler.addShapedRecipe("wooden_barrel", MetaTileEntities.WOODEN_DRUM.getStackForm(), "rSs", "PRP", "PRP", 'S', "slimeball", 'P', "plankWood", 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Iron));
            ModHandler.addShapedRecipe("bronze_drum", MetaTileEntities.BRONZE_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Bronze), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Bronze));
            ModHandler.addShapedRecipe("steel_drum", MetaTileEntities.STEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Steel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Steel));
            ModHandler.addShapedRecipe("stainless_steel_drum", MetaTileEntities.STAINLESS_STEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.StainlessSteel));
            ModHandler.addShapedRecipe("titanium_drum", MetaTileEntities.TITANIUM_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(OrePrefix.plate, Materials.Titanium), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.Titanium));
            ModHandler.addShapedRecipe("tungstensteel_drum", MetaTileEntities.TUNGSTENSTEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(OrePrefix.plate, Materials.TungstenSteel), 'R', new UnificationEntry(OrePrefix.stickLong, Materials.TungstenSteel));
        }

        ModHandler.addShapedRecipe("tesla_coil", MetaTileEntities.TESLA_COIL.getStackForm(), "XXX", "YHY", "XXX", 'X', new UnificationEntry(OrePrefix.wireGtQuadruple, Materials.Copper), 'Y', MetaItems.EMITTER_MV, 'H', MetaTileEntities.HULL[GTValues.MV].getStackForm());
    }

    public static <T extends MetaTileEntity & ITieredMetaTileEntity> void registerMachineRecipe(T[] metaTileEntities, Object... recipe) {
        for (T metaTileEntity : metaTileEntities) {

            // Needed to skip certain tiers if not enabled.
            // Leaves UHV+ machine recipes to be implemented by addons.
            if (metaTileEntity != null) {
                Object[] prepRecipe = prepareRecipe(metaTileEntity.getTier(), Arrays.copyOf(recipe, recipe.length));
                if (prepRecipe == null) {
                    return;
                }
                ModHandler.addShapedRecipe(metaTileEntity.getMetaName(), metaTileEntity.getStackForm(), prepRecipe);
            }
        }
    }

    private static Object[] prepareRecipe(int tier, Object... recipe) {
        for (int i = 3; i < recipe.length; i++) {
            if (recipe[i] instanceof Component) {
                Object component = ((Component) recipe[i]).getIngredient(tier);
                if (component == null) {
                    return null;
                }
                recipe[i] = component;
            }
        }
        return recipe;
    }

}
