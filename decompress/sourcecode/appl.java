import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appl extends agzi implements ahax
{
    public static final appl a;
    private static volatile ahbe l;
    public int b;
    public ajsq c;
    public aioe d;
    public agzy e;
    public apoz f;
    public appj g;
    public appg h;
    public boolean i;
    public ajsq j;
    public agyc k;
    private amer m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)appl.class, (agzi)(a = new appl()));
    }
    
    private appl() {
        this.o = 2;
        this.e = emptyProtobufList();
        this.k = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = appl.l) == null) {
                    synchronized (appl.class) {
                        if (appl.l == null) {
                            appl.l = (ahbe)new agzb((agzi)appl.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return appl.a;
            }
            case 4: {
                return new agza((agzi)appl.a);
            }
            case 3: {
                return new appl();
            }
            case 2: {
                return newMessageInfo((MessageLite)appl.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u041b\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1007\u0006\b\u1409\u0007\t\u1409\t\n\u100a\n\u000b\u1409\b", new Object[] { "b", "c", "d", "e", ajsq.class, "f", "g", "h", "i", "j", "n", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
