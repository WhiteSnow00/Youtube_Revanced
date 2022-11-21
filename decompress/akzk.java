import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzk extends ahcz implements aheo
{
    public static final akzk a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(akzk.class, a = new akzk());
    }
    
    private akzk() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akzk.d) == null) {
                    synchronized (akzk.class) {
                        if (akzk.d == null) {
                            akzk.d = (ahev)new ahcs((ahcz)akzk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzk.a;
            }
            case 4: {
                return new ahcr((ahcz)akzk.a);
            }
            case 3: {
                return new akzk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
