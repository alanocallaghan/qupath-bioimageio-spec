package qupath.bioimageio.spec.axes;

import qupath.bioimageio.spec.sizes.FixedSize;
import qupath.bioimageio.spec.sizes.Size;
import qupath.bioimageio.spec.tensor.BaseTensor;

import java.util.List;

class BatchAxis extends AxisBase {
    private final int size;
    private final boolean concatenable = true;

    BatchAxis(String id, String description, int size) {
        super(id, description);
        this.size = size;
    }

    @Override
    public AxisType getType() {
        return AxisType.B;
    }

    @Override
    public Size getSize() {
        return new FixedSize(size);
    }

    @Override
    public void validate(List<? extends BaseTensor> tensors) {
        // fixed size doesn't need validation
    }
}
