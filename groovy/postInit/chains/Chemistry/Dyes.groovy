BR = recipemap('batch_reactor')
MIXER = recipemap('mixer')
EBF = recipemap('electric_blast_furnace')

BR.recipeBuilder()
        .inputs(metaitem('dustLeadOxide') * 2)
        .fluidInputs(fluid('nitric_acid') * 2000)
        .outputs(metaitem('dustLeadNitrate') * 9)
        .fluidOutputs(fluid('water') * 1000)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs(metaitem('dustManganeseIiOxide'))
        .inputs(metaitem('dustIronIiiOxide'))
        .outputs(metaitem('dustSienna') * 2)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

furnace.add(metaitem('dustSienna'), metaitem('dustBurntSienna'))

BR.recipeBuilder()
        .inputs(metaitem('dustArsenicTrioxide') * 5)
        .fluidInputs(fluid('soda_ash_solution') * 1000)
        .fluidOutputs(fluid('carbon_dioxide') * 1000)
        .fluidOutputs(fluid('gtfo_sodium_arsenite_solution') * 1000)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

BR.recipeBuilder()
        .inputs(metaitem('dustCopper') * 2)
        .fluidInputs(fluid('sulfuric_acid') * 2000)
        .fluidInputs(fluid('gtfo_sodium_arsenite_solution') * 1000)
        .outputs(metaitem('cupric_hydrogen_arsenite_dust') * 12)
        .EUt(30)
        .duration(200)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs(metaitem('dustAlumina') * 5)
        .inputs(metaitem('dustCobaltOxide') * 2)
        .outputs(metaitem('dustCobaltAluminate') * 7)
        .blastFurnaceTemp(1100)
        .EUt(120)
        .duration(200)
        .buildAndRegister()