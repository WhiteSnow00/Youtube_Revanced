import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfn extends agzi implements ahax
{
    public static final ajfn a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public aqcz d;
    public String e;
    public int f;
    public int g;
    public String h;
    public int i;
    private byte k;
    
    static {
        final ajfn a2 = new ajfn();
        agzi.registerDefaultInstance(ajfn.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 362363524, ahcm.k, ajfn.class);
    }
    
    private ajfn() {
        this.k = 2;
        this.e = "";
        this.h = "";
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
                final ahbe j;
                if ((j = ajfn.j) == null) {
                    synchronized (ajfn.class) {
                        if (ajfn.j == null) {
                            ajfn.j = (ahbe)new agzb((agzi)ajfn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajfn.a;
            }
            case 4: {
                return new agza((agzi)ajfn.a);
            }
            case 3: {
                return new ajfn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfn.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u100c\u0004\u0005\u1004\u0005\u0007\u1008\u0006\b\u100c\u0007", new Object[] { "c", "d", "e", "f", ajfl.a(), "g", "h", "i", ajcg.p });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
