import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfb extends agzi implements ahax
{
    public static final ajfb a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    
    static {
        final ajfb a2 = new ajfb();
        agzi.registerDefaultInstance(ajfb.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 224, ahcm.k, ajfb.class);
    }
    
    private ajfb() {
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ajfb.j) == null) {
                    synchronized (ajfb.class) {
                        if (ajfb.j == null) {
                            ajfb.j = (ahbe)new agzb((agzi)ajfb.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajfb.a;
            }
            case 4: {
                return new agza((agzi)ajfb.a);
            }
            case 3: {
                return new ajfb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfb.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1004\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
