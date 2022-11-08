import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbn extends agzi implements ahax
{
    public static final ajbn a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public agzy d;
    private int f;
    private byte g;
    
    static {
        final ajbn a2 = new ajbn();
        agzi.registerDefaultInstance(ajbn.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 89668214, ahcm.k, ajbn.class);
    }
    
    private ajbn() {
        this.g = 2;
        this.c = "";
        this.d = agzi.emptyProtobufList();
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
                final ahbe e;
                if ((e = ajbn.e) == null) {
                    synchronized (ajbn.class) {
                        if (ajbn.e == null) {
                            ajbn.e = (ahbe)new agzb((agzi)ajbn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajbn.a;
            }
            case 4: {
                return new agza((agzi)ajbn.a);
            }
            case 3: {
                return new ajbn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "f", "c", "d", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
