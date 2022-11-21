import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcj extends ahcz implements aheo
{
    public static final aqcj a;
    private static volatile ahev e;
    public int b;
    public String c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqcj.class, a = new aqcj());
    }
    
    private aqcj() {
        this.f = 2;
        this.c = "";
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
                if ((e = aqcj.e) == null) {
                    synchronized (aqcj.class) {
                        if (aqcj.e == null) {
                            aqcj.e = (ahev)new ahcs((ahcz)aqcj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqcj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcj.a);
            }
            case 3: {
                return new aqcj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
