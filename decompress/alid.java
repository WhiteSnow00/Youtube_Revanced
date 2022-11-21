import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alid extends ahcz implements aheo
{
    public static final alid a;
    private static volatile ahev h;
    public int b;
    public String c;
    public apry d;
    public alji e;
    public int f;
    public aqvm g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alid.class, a = new alid());
    }
    
    private alid() {
        this.i = 2;
        this.c = "";
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
                if ((h = alid.h) == null) {
                    synchronized (alid.class) {
                        if (alid.h == null) {
                            alid.h = (ahev)new ahcs((ahcz)alid.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alid.a;
            }
            case 4: {
                return new ahcr((ahcz)alid.a);
            }
            case 3: {
                return new alid();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alid.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u100c\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", alfq.j, "g" });
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
