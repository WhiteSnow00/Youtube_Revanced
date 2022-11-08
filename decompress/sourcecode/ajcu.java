import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcu extends agzi implements ahax
{
    public static final ajcu a;
    public static final agzg b;
    private static volatile ahbe d;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final ajcu a2 = new ajcu();
        agzi.registerDefaultInstance(ajcu.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 388636837, ahcm.k, ajcu.class);
    }
    
    private ajcu() {
        this.f = 2;
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
                final ahbe d;
                if ((d = ajcu.d) == null) {
                    synchronized (ajcu.class) {
                        if (ajcu.d == null) {
                            ajcu.d = (ahbe)new agzb((agzi)ajcu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajcu.a;
            }
            case 4: {
                return new agza((agzi)ajcu.a);
            }
            case 3: {
                return new ajcu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcu.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
