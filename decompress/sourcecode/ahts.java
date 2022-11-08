import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahts extends agzi implements ahax
{
    public static final ahts a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public int f;
    
    static {
        final ahts a2 = new ahts();
        agzi.registerDefaultInstance(ahts.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 364, ahcm.k, ahts.class);
    }
    
    private ahts() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahts.g) == null) {
                    synchronized (ahts.class) {
                        if (ahts.g == null) {
                            ahts.g = (ahbe)new agzb((agzi)ahts.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahts.a;
            }
            case 4: {
                return new agza((agzi)ahts.a);
            }
            case 3: {
                return new ahts();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahts.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002", new Object[] { "c", "d", "e", "f", ahtu.a() });
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
