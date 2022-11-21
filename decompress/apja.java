import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apja extends ahcz implements aheo
{
    public static final apja a;
    private static volatile ahev e;
    public int b;
    public amiy c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apja.class, a = new apja());
    }
    
    private apja() {
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
                final ahev e;
                if ((e = apja.e) == null) {
                    synchronized (apja.class) {
                        if (apja.e == null) {
                            apja.e = (ahev)new ahcs((ahcz)apja.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apja.a;
            }
            case 4: {
                return new ahcr((ahcz)apja.a);
            }
            case 3: {
                return new apja();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apja.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
