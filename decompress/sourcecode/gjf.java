import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjf
{
    public String a;
    public Optional b;
    public Optional c;
    private float d;
    private byte e;
    
    public gjf() {
    }
    
    public gjf(final byte[] array) {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public final gjj a() {
        final byte e = this.e;
        final boolean b = true;
        if (e == 1) {
            final String a = this.a;
            if (a != null) {
                final gjj gjj = new gjj(a, this.d, this.b, this.c);
                boolean b2 = false;
                Label_0100: {
                    if (gjj.c.isPresent() || gjj.d.isPresent()) {
                        b2 = b;
                        if (!gjj.c.isPresent()) {
                            break Label_0100;
                        }
                        if (!gjj.d.isPresent()) {
                            b2 = b;
                            break Label_0100;
                        }
                    }
                    b2 = false;
                }
                agot.E(b2, (Object)"This object must populate params for (exactly) one of the scroll selection methods.");
                return gjj;
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tag");
        }
        if (this.e == 0) {
            sb.append(" visibilityPercentSelectionThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final float d) {
        this.d = d;
        this.e = 1;
    }
}
