import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxb extends ahcz implements aheo
{
    public static final akxb a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public String d;
    public ahdp e;
    public boolean f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akxb.class, a = new akxb());
    }
    
    private akxb() {
        this.i = 2;
        this.d = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((h = akxb.h) == null) {
                    synchronized (akxb.class) {
                        if (akxb.h == null) {
                            akxb.h = (ahev)new ahcs((ahcz)akxb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akxb.a;
            }
            case 4: {
                return new ahcr((byte[])null, (byte[])null);
            }
            case 3: {
                return new akxb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a\u0006\u100c\u0003", new Object[] { "b", "c", "d", "f", "e", "g", amsb.l });
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
