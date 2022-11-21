import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxh extends ahcz implements aheo
{
    public static final akxh a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public String d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akxh.class, a = new akxh());
    }
    
    private akxh() {
        this.f = 2;
        this.d = "";
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
                final ahev e;
                if ((e = akxh.e) == null) {
                    synchronized (akxh.class) {
                        if (akxh.e == null) {
                            akxh.e = (ahev)new ahcs((ahcz)akxh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akxh.a;
            }
            case 4: {
                return new ahcr((ahcz)akxh.a);
            }
            case 3: {
                return new akxh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
