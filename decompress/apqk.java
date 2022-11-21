import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqk extends ahcz implements aheo
{
    public static final apqk a;
    private static volatile ahev f;
    public int b;
    public apqn c;
    public ahbt d;
    public apql e;
    private ajws g;
    private aisc h;
    private ahjl i;
    private apqi j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apqk.class, a = new apqk());
    }
    
    private apqk() {
        this.k = 2;
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apqk.f) == null) {
                    synchronized (apqk.class) {
                        if (apqk.f == null) {
                            apqk.f = (ahev)new ahcs((ahcz)apqk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqk.a;
            }
            case 4: {
                return new ahcr((ahcz)apqk.a);
            }
            case 3: {
                return new apqk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "g", "h", "d", "i", "j", "e" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
