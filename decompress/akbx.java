import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbx extends ahcz implements aheo
{
    public static final akbx a;
    private static volatile ahev d;
    public int b;
    public String c;
    private ajws e;
    private ajws f;
    private ahjl g;
    private akby h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akbx.class, a = new akbx());
    }
    
    private akbx() {
        this.i = 2;
        final ahbt b = ahbt.b;
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
                final ahev d;
                if ((d = akbx.d) == null) {
                    synchronized (akbx.class) {
                        if (akbx.d == null) {
                            akbx.d = (ahev)new ahcs((ahcz)akbx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akbx.a;
            }
            case 4: {
                return new ahcr((ahcz)akbx.a);
            }
            case 3: {
                return new akbx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbx.a, "\u0001\u0005\u0000\u0001\b\u0013\u0005\u0000\u0000\u0004\b\u1409\n\n\u1409\u0002\u000b\u1409\u0004\f\u1409\f\u0013\u1008\u0012", new Object[] { "b", "g", "e", "f", "h", "c" });
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
