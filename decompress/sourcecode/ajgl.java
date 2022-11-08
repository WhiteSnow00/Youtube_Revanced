import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgl extends agzi implements ahax
{
    public static final ajgl a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public agyc e;
    
    static {
        final ajgl a2 = new ajgl();
        agzi.registerDefaultInstance(ajgl.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 299, ahcm.k, ajgl.class);
    }
    
    private ajgl() {
        this.d = "";
        final agyc b = agyc.b;
        this.e = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajgl.f) == null) {
                    synchronized (ajgl.class) {
                        if (ajgl.f == null) {
                            ajgl.f = (ahbe)new agzb((agzi)ajgl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajgl.a;
            }
            case 4: {
                return new agza((agzi)ajgl.a);
            }
            case 3: {
                return new ajgl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgl.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100a\u0002", new Object[] { "c", "d", "e" });
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
