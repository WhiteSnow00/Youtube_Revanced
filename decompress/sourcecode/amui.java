import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amui extends agzi implements ahax
{
    public static final amui a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public agzy e;
    
    static {
        final amui a2 = new amui();
        agzi.registerDefaultInstance(amui.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 198, ahcm.k, amui.class);
    }
    
    private amui() {
        this.d = "";
        this.e = agzi.emptyProtobufList();
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
                if ((f = amui.f) == null) {
                    synchronized (amui.class) {
                        if (amui.f == null) {
                            amui.f = (ahbe)new agzb((agzi)amui.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amui.a;
            }
            case 4: {
                return new agza((short[])null, (int[][])null);
            }
            case 3: {
                return new amui();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amui.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "c", "d", "e", aojk.class });
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
