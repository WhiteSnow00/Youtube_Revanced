import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appj extends ahcz implements aheo
{
    public static final appj a;
    private static volatile ahev b;
    private ahjl A;
    private apph B;
    private appl C;
    private amiy D;
    private aisc E;
    private byte F;
    private int c;
    private int d;
    private ajws e;
    private ajws f;
    private ajws g;
    private appm h;
    private aooy i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private ajws o;
    private ajws p;
    private appk q;
    private ajws r;
    private aich s;
    private aich t;
    private aico u;
    private alqb v;
    private aiez w;
    private appi x;
    private anxb y;
    private anxb z;
    
    static {
        ahcz.registerDefaultInstance(appj.class, a = new appj());
    }
    
    private appj() {
        this.F = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = appj.b) == null) {
                    synchronized (appj.class) {
                        if (appj.b == null) {
                            appj.b = (ahev)new ahcs((ahcz)appj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appj.a;
            }
            case 4: {
                return new ahcr((ahcz)appj.a);
            }
            case 3: {
                return new appj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appj.a, "\u0001\u001b\u0000\u0002\u0001/\u001b\u0000\u0000\u001b\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\n\n\u1409\f\f\u1409\u000e\u0010\u1409\u0013\u0017\u1409\u0011\u0018\u1409\u001a\u001b\u1409\u000b \u1409\"!\u1409\u0004\"\u1409#%\u1409$&\u1409%'\u1409\u001b(\u1409\u0015)\u1409\u0016*\u1409\u001c+\u1409\u0017,\u1409 .\u1409\u001d/\u1409\u001e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "o", "p", "r", "q", "v", "n", "B", "h", "C", "D", "E", "w", "s", "t", "x", "u", "A", "y", "z" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.F = f;
                return null;
            }
            case 0: {
                return this.F;
            }
        }
    }
}
