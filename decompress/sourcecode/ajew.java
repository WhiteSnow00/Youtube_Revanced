import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajew extends agzi implements ahax
{
    public static final ajew a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajew a2 = new ajew();
        agzi.registerDefaultInstance(ajew.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 378918909, ahcm.k, ajew.class);
    }
    
    private ajew() {
        this.f = 2;
        this.d = "";
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
                if ((e = ajew.e) == null) {
                    synchronized (ajew.class) {
                        if (ajew.e == null) {
                            ajew.e = (ahbe)new agzb((agzi)ajew.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajew.a;
            }
            case 4: {
                return new agza((agzi)ajew.a);
            }
            case 3: {
                return new ajew();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajew.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0002", new Object[] { "c", "d" });
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
