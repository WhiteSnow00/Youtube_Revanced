import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfz extends agzi implements ahax
{
    public static final ahfz a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public agyc g;
    
    static {
        agzi.registerDefaultInstance(ahfz.class, a = new ahfz());
    }
    
    private ahfz() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahfz.h) == null) {
                    synchronized (ahfz.class) {
                        if (ahfz.h == null) {
                            ahfz.h = (ahbe)new agzb((agzi)ahfz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahfz.a;
            }
            case 4: {
                return new agza((agzi)ahfz.a);
            }
            case 3: {
                return new ahfz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfz.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
