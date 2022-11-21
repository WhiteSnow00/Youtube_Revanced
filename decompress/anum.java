import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anum extends ahcz implements aheo
{
    public static final anum a;
    private static volatile ahev e;
    public int b;
    public anxb c;
    public ahbt d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(anum.class, a = new anum());
    }
    
    private anum() {
        this.g = 2;
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = anum.e) == null) {
                    synchronized (anum.class) {
                        if (anum.e == null) {
                            anum.e = (ahev)new ahcs((ahcz)anum.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anum.a;
            }
            case 4: {
                return new ahcr((ahcz)anum.a);
            }
            case 3: {
                return new anum();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anum.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
