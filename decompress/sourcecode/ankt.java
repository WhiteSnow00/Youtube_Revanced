import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankt extends agzi implements ahax
{
    public static final ankt a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    
    static {
        final ankt a2 = new ankt();
        agzi.registerDefaultInstance(ankt.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajku.a, a2, (MessageLite)a2, null, 413030470, ahcm.k, ankt.class);
    }
    
    private ankt() {
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ankt.d) == null) {
                    synchronized (ankt.class) {
                        if (ankt.d == null) {
                            ankt.d = (ahbe)new agzb((agzi)ankt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ankt.a;
            }
            case 4: {
                return new agza((agzi)ankt.a);
            }
            case 3: {
                return new ankt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankt.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "c" });
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
