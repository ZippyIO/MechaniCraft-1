package Will11690.mod.MechaniCraft.Mobs.CustomMobModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HellFireSpider extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RearEnd;
    ModelRenderer Leg8;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
  
  public HellFireSpider()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 32, 4);
      Head.addBox(-4F, -4F, -8F, 8, 8, 8);
      Head.setRotationPoint(0F, 20F, -3F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-3F, -3F, -3F, 6, 6, 6);
      Body.setRotationPoint(0F, 20F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RearEnd = new ModelRenderer(this, 0, 12);
      RearEnd.addBox(-5F, -4F, -6F, 10, 8, 12);
      RearEnd.setRotationPoint(0F, 20F, 9F);
      RearEnd.setTextureSize(64, 32);
      RearEnd.mirror = true;
      setRotation(RearEnd, 0F, 0F, 0F);
      Leg8 = new ModelRenderer(this, 18, 0);
      Leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg8.setRotationPoint(4F, 20F, -1F);
      Leg8.setTextureSize(64, 32);
      Leg8.mirror = true;
      setRotation(Leg8, 0F, 0.5759587F, 0.1919862F);
      Leg6 = new ModelRenderer(this, 18, 0);
      Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg6.setRotationPoint(4F, 20F, 0F);
      Leg6.setTextureSize(64, 32);
      Leg6.mirror = true;
      setRotation(Leg6, 0F, 0.2792527F, 0.1919862F);
      Leg4 = new ModelRenderer(this, 18, 0);
      Leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg4.setRotationPoint(4F, 20F, 1F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, -0.2792527F, 0.1919862F);
      Leg2 = new ModelRenderer(this, 18, 0);
      Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg2.setRotationPoint(4F, 20F, 2F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
      Leg7 = new ModelRenderer(this, 18, 0);
      Leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg7.setRotationPoint(-4F, 20F, -1F);
      Leg7.setTextureSize(64, 32);
      Leg7.mirror = true;
      setRotation(Leg7, 0F, -0.5759587F, -0.1919862F);
      Leg5 = new ModelRenderer(this, 18, 0);
      Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg5.setRotationPoint(-4F, 20F, 0F);
      Leg5.setTextureSize(64, 32);
      Leg5.mirror = true;
      setRotation(Leg5, 0F, -0.2792527F, -0.1919862F);
      Leg3 = new ModelRenderer(this, 18, 0);
      Leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg3.setRotationPoint(-4F, 20F, 1F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0.2792527F, -0.1919862F);
      Leg1 = new ModelRenderer(this, 18, 0);
      Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg1.setRotationPoint(-4F, 20F, 2F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
  }
  
  public void render(Entity par1Entity, float par1, float par2, float par3, float par4, float par5, float par6, float par7)
  {

    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    Body.render(par7);
    RearEnd.render(par7);
    Leg8.render(par7);
    Leg6.render(par7);
    Leg4.render(par7);
    Leg2.render(par7);
    Leg7.render(par7);
    Leg5.render(par7);
    Leg3.render(par7);
    Leg1.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {

  }

}
