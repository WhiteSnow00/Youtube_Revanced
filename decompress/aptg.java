import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptg extends ahcz implements aheo
{
    public static final aptg a;
    private static volatile ahev d;
    public aowb b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aptg.class, a = new aptg());
    }
    
    private aptg() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aptg.d) == null) {
                    synchronized (aptg.class) {
                        if (aptg.d == null) {
                            aptg.d = (ahev)new ahcs((ahcz)aptg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptg.a;
            }
            case 4: {
                return new ahcr((ahcz)aptg.a);
            }
            case 3: {
                return new aptg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", aprh.q });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
