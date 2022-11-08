import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anav extends agzd implements agze
{
    public static final anav a;
    public static final agzg b;
    private static volatile ahbe n;
    public int c;
    public String d;
    public agyc e;
    public String f;
    public long g;
    public long h;
    public String i;
    public agzy j;
    public String k;
    public String m;
    private byte o;
    
    static {
        final anav a2 = new anav();
        agzi.registerDefaultInstance((Class)anav.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 119, ahcm.k, (Class)anav.class);
    }
    
    private anav() {
        this.o = 2;
        this.d = "";
        this.e = agyc.b;
        this.f = "";
        this.i = "";
        this.j = agzi.emptyProtobufList();
        this.k = "";
        this.m = "";
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
                final ahbe n;
                if ((n = anav.n) == null) {
                    synchronized (anav.class) {
                        if (anav.n == null) {
                            anav.n = (ahbe)new agzb((agzi)anav.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return anav.a;
            }
            case 4: {
                return new agzc(anav.a);
            }
            case 3: {
                return new anav();
            }
            case 2: {
                return newMessageInfo((MessageLite)anav.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1002\u0003\u0004\u1008\u0005\u0005\u001a\u0006\u1008\u0006\u0007\u1008\u0007\b\u1008\u0002\t\u1002\u0004", new Object[] { "c", "d", "e", "g", "i", "j", "k", "m", "f", "h" });
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
