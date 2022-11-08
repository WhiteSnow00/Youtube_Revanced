// 
// Decompiled by Procyon v0.6.0
// 

public final class aces extends zmo
{
    private final aeyr c;
    
    public aces(final tbi tbi, final zmj zmj, final oas oas, final aeyr c) {
        super(tbi, zmj, oas, 7200000L);
        this.c = c;
    }
    
    protected final void b(final tbi tbi) {
        if (((aexq)this.c.a()).h()) {
            final adfy adfy = (adfy)((aexq)this.c.a()).c();
            String s;
            if (tbi instanceof tbp) {
                s = "MEMORY";
            }
            else if (tbi instanceof tbq) {
                s = "DISK";
            }
            else {
                s = "UNKNOWN";
            }
            adfy.e("DEFAULT_IMAGE_CLIENT", s, false);
        }
    }
}
