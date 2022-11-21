import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrv extends ahcz implements aheo
{
    public static final akrv a;
    private static volatile ahev e;
    public aknj b;
    public aisc c;
    public ahbt d;
    private int f;
    private ahjl g;
    private ajxn h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akrv.class, a = new akrv());
    }
    
    private akrv() {
        this.i = 2;
        this.d = ahbt.b;
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
                final ahev e;
                if ((e = akrv.e) == null) {
                    synchronized (akrv.class) {
                        if (akrv.e == null) {
                            akrv.e = (ahev)new ahcs((ahcz)akrv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akrv.a;
            }
            case 4: {
                return new ahcr((ahcz)akrv.a);
            }
            case 3: {
                return new akrv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrv.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0309\u1409\u0004", new Object[] { "f", "b", "c", "g", "d", "h" });
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
