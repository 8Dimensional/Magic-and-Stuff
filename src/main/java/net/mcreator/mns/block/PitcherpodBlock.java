
package net.mcreator.mns.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PitcherpodBlock extends FlowerBlock {
	public PitcherpodBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.SLIME_BLOCK).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}
}