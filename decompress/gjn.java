import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjn
{
    public String a;
    public Optional b;
    public Optional c;
    private float d;
    private byte e;
    
    public gjn() {
    }
    
    public gjn(final byte[] array) {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public final gjr a() {
        final byte e = this.e;
        final boolean b = true;
        if (e == 1) {
            final String a = this.a;
            if (a != null) {
                final gjr gjr = new gjr(a, this.d, this.b, this.c);
                boolean b2 = false;
                Label_0105: {
                    if (gjr.c.isPresent() || gjr.d.isPresent()) {
                        b2 = b;
                        if (!gjr.c.isPresent()) {
                            break Label_0105;
                        }
                        if (!gjr.d.isPresent()) {
                            b2 = b;
                            break Label_0105;
                        }
                    }
                    b2 = false;
                }
                adkp.R(b2, "This object must populate params for (exactly) one of the scroll selection methods.");
                return gjr;
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
