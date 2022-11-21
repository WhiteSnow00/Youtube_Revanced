import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqw extends ahcz implements aheo
{
    public static final agqw a;
    private static volatile ahev f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(agqw.class, a = new agqw());
    }
    
    private agqw() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = agqw.f) == null) {
                    synchronized (agqw.class) {
                        if (agqw.f == null) {
                            agqw.f = (ahev)new ahcs((ahcz)agqw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqw.a;
            }
            case 4: {
                return new ahcr((ahcz)agqw.a);
            }
            case 3: {
                return new agqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
