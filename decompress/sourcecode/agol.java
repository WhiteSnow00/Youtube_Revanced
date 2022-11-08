import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agol extends agzi implements ahax
{
    public static final agol a;
    private static volatile ahbe l;
    public agoj b;
    public String c;
    public agzy d;
    public agzy e;
    public agzq f;
    public String g;
    public boolean h;
    public int i;
    public String j;
    public agok k;
    
    static {
        agzi.registerDefaultInstance(agol.class, a = new agol());
    }
    
    private agol() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyIntList();
        this.g = "";
        final agyc b = agyc.b;
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = agol.l) == null) {
                    synchronized (agol.class) {
                        if (agol.l == null) {
                            agol.l = (ahbe)new agzb((agzi)agol.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return agol.a;
            }
            case 4: {
                return new agza((agzi)agol.a);
            }
            case 3: {
                return new agol();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agol.a, "\u0000\n\u0000\u0000\u0001\u0011\n\u0000\u0003\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004,\u0005\u021a\u0006\u0208\b\u0007\t\f\u0010\u0208\u0011\t", new Object[] { "b", "c", "d", "f", "e", "g", "h", "i", "j", "k" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
