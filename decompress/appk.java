import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appk extends ahcz implements aheo
{
    public static final appk a;
    private static volatile ahev b;
    private int c;
    private aooo d;
    private aies e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(appk.class, a = new appk());
    }
    
    private appk() {
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
                final ahev b;
                if ((b = appk.b) == null) {
                    synchronized (appk.class) {
                        if (appk.b == null) {
                            appk.b = (ahev)new ahcs((ahcz)appk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appk.a;
            }
            case 4: {
                return new ahcr((ahcz)appk.a);
            }
            case 3: {
                return new appk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appk.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0000\ueb11\u1f11\u1409\u0001", new Object[] { "c", "d", "e" });
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
