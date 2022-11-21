import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqz extends ahcz implements aheo
{
    public static final aiqz a;
    private static volatile ahev h;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    public aisc g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aiqz.class, a = new aiqz());
    }
    
    private aiqz() {
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
                final ahev h;
                if ((h = aiqz.h) == null) {
                    synchronized (aiqz.class) {
                        if (aiqz.h == null) {
                            aiqz.h = (ahev)new ahcs((ahcz)aiqz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aiqz.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqz.a);
            }
            case 3: {
                return new aiqz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqz.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0001\u0002\u1002\u0002\u0003\u1002\u0003\u0004\u1409\u0004\u0005\u100c\u0000", new Object[] { "b", "d", "e", "f", "g", "c", alwa.m });
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
