import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojl extends ahcz implements aheo
{
    public static final aojl a;
    private static volatile ahev g;
    public int b;
    public aisc c;
    public String d;
    public aint e;
    public aplp f;
    private aisc h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aojl.class, a = new aojl());
    }
    
    private aojl() {
        this.i = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aojl.g) == null) {
                    synchronized (aojl.class) {
                        if (aojl.g == null) {
                            aojl.g = (ahev)new ahcs((ahcz)aojl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aojl.a;
            }
            case 4: {
                return new ahcr((ahcz)aojl.a);
            }
            case 3: {
                return new aojl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojl.a, "\u0001\u0005\u0000\u0001\u0002\u000b\u0005\u0000\u0000\u0003\u0002\u1409\u0001\u0006\u1008\u0005\u0007\u1009\u0007\t\u1409\b\u000b\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
