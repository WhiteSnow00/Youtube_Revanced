import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbd extends agzi implements ahax
{
    public static final apbd a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aibc g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private aibc l;
    private aibc m;
    private aibc n;
    private ajsq o;
    private ajsq p;
    private aibc q;
    private ahfw r;
    private byte s;
    
    static {
        agzi.registerDefaultInstance(apbd.class, a = new apbd());
    }
    
    private apbd() {
        this.s = 2;
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = apbd.b) == null) {
                    synchronized (apbd.class) {
                        if (apbd.b == null) {
                            apbd.b = (ahbe)new agzb((agzi)apbd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbd.a;
            }
            case 4: {
                return new agza((agzi)apbd.a);
            }
            case 3: {
                return new apbd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbd.a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0000\u000f\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0010\t\u1409\u0005\n\u1409\u0006\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000e\u1409\n\u000f\u1409\u000b\u0010\u1409\f\u0011\u1409\r\u0012\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "r", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
