import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbn extends ahcz implements aheo
{
    public static final aqbn a;
    public static final ahcx b;
    private static volatile ahev o;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public aqgs h;
    public ajws i;
    public int j;
    public aowb k;
    public ahdp l;
    public ahdp m;
    public ahej n;
    private byte p;
    
    static {
        final aqbn a2 = new aqbn();
        ahcz.registerDefaultInstance(aqbn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 154, ahgc.k, aqbn.class);
    }
    
    private aqbn() {
        this.n = ahej.a;
        this.p = 2;
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.l = ahcz.emptyProtobufList();
        this.m = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = aqbn.o) == null) {
                    synchronized (aqbn.class) {
                        if (aqbn.o == null) {
                            aqbn.o = (ahev)new ahcs((ahcz)aqbn.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aqbn.a;
            }
            case 4: {
                return new ahcr((float[])null, (short[][])null);
            }
            case 3: {
                return new aqbn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbn.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0001\u0002\u0004\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1409\u0005\u0007\u100c\u0007\b\u1409\b\t\u001a\n\u001a\u000b\u0432\f\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "j", aqbp.a(), "k", "l", "m", "n", aqbm.a, "i" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
