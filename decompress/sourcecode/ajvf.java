import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvf extends agzi implements ahax
{
    public static final ajvf a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public String d;
    private int f;
    
    static {
        final ajvf a2 = new ajvf();
        agzi.registerDefaultInstance(ajvf.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 421321174, ahcm.k, ajvf.class);
    }
    
    private ajvf() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajvf.e) == null) {
                    synchronized (ajvf.class) {
                        if (ajvf.e == null) {
                            ajvf.e = (ahbe)new agzb((agzi)ajvf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajvf.a;
            }
            case 4: {
                return new agza((agzi)ajvf.a);
            }
            case 3: {
                return new ajvf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvf.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0001", new Object[] { "f", "c", "d" });
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
