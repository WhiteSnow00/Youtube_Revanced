import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibu extends agzi implements ahax
{
    public static final aibu a;
    private static volatile ahbe b;
    private int c;
    private ajpp d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibu.class, (agzi)(a = new aibu()));
    }
    
    private aibu() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aibu.b) == null) {
                    synchronized (aibu.class) {
                        if (aibu.b == null) {
                            aibu.b = (ahbe)new agzb((agzi)aibu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aibu.a;
            }
            case 4: {
                return new agza((agzi)aibu.a);
            }
            case 3: {
                return new aibu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibu.a, "\u0001\u0001\u0000\u0001\uf90f\u1b55\uf90f\u1b55\u0001\u0000\u0000\u0001\uf90f\u1b55\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
