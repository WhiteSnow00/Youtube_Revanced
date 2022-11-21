import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebw extends aebx
{
    public aebw(final aeae aeae) {
        super(aeae);
    }
    
    @Override
    protected final void l(final Canvas canvas) {
        if (this.g.isEmpty()) {
            super.l(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.g);
        super.l(canvas);
        canvas.restore();
    }
}
