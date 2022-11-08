import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import com.google.protobuf.MessageLite;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahay
{
    private static final char[] a;
    
    static {
        Arrays.fill(a = new char[80], ' ');
    }
    
    static String a(final MessageLite messageLite, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(s);
        d(messageLite, sb, 0);
        return sb.toString();
    }
    
    static void b(final StringBuilder sb, final int n, final String s, final Object o) {
        if (o instanceof List) {
            final Iterator iterator = ((List)o).iterator();
            while (iterator.hasNext()) {
                b(sb, n, s, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                b(sb, n, s, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        c(n, sb);
        String string = s;
        if (!s.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(s.charAt(0)));
            for (int i = 1; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (Character.isUpperCase(char1)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(char1));
            }
            string = sb2.toString();
        }
        sb.append(string);
        if (o instanceof String) {
            sb.append(": \"");
            sb.append(ahbz.a(agyc.A((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof agyc) {
            sb.append(": \"");
            sb.append(ahbz.a((agyc)o));
            sb.append('\"');
            return;
        }
        if (o instanceof agzi) {
            sb.append(" {");
            d((MessageLite)o, sb, n + 2);
            sb.append("\n");
            c(n, sb);
            sb.append("}");
            return;
        }
        if (o instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)o;
            final int n2 = n + 2;
            b(sb, n2, "key", entry.getKey());
            b(sb, n2, "value", entry.getValue());
            sb.append("\n");
            c(n, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(o);
    }
    
    private static void c(int i, final StringBuilder sb) {
        while (i > 0) {
            int n = 80;
            if (i <= 80) {
                n = i;
            }
            sb.append(ahay.a, 0, n);
            i -= n;
        }
    }
    
    private static void d(final MessageLite messageLite, final StringBuilder sb, final int n) {
        final HashSet set = new HashSet();
        final HashMap hashMap = new HashMap();
        final TreeMap treeMap = new TreeMap();
        final Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        final int n2 = 0;
        for (final Method method : declaredMethods) {
            if (!Modifier.isStatic(method.getModifiers())) {
                if (method.getName().length() >= 3) {
                    if (method.getName().startsWith("set")) {
                        set.add(method.getName());
                    }
                    else if (Modifier.isPublic(method.getModifiers()) && method.getParameterTypes().length == 0) {
                        if (method.getName().startsWith("has")) {
                            hashMap.put(method.getName(), method);
                        }
                        else if (method.getName().startsWith("get")) {
                            treeMap.put(method.getName(), method);
                        }
                    }
                }
            }
        }
        for (final Map.Entry<String, V> entry : treeMap.entrySet()) {
            final String substring = entry.getKey().substring(3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final Method method2 = (Method)entry.getValue();
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, n, substring.substring(0, substring.length() - 4), agzi.invokeOrDie(method2, (Object)messageLite, new Object[0]));
                    continue;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                final Method method3 = (Method)entry.getValue();
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, n, substring.substring(0, substring.length() - 3), agzi.invokeOrDie(method3, (Object)messageLite, new Object[0]));
                    continue;
                }
            }
            if (set.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                final Method method4 = (Method)entry.getValue();
                final Method method5 = (Method)hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 == null) {
                    continue;
                }
                final Object invokeOrDie = agzi.invokeOrDie(method4, (Object)messageLite, new Object[0]);
                Label_0770: {
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            if (!(boolean)invokeOrDie) {
                                continue;
                            }
                        }
                        else if (invokeOrDie instanceof Integer) {
                            if ((int)invokeOrDie == 0) {
                                continue;
                            }
                        }
                        else if (invokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits((float)invokeOrDie) == 0) {
                                continue;
                            }
                        }
                        else if (invokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits((double)invokeOrDie) == 0L) {
                                continue;
                            }
                        }
                        else {
                            boolean b;
                            if (invokeOrDie instanceof String) {
                                b = invokeOrDie.equals("");
                            }
                            else if (invokeOrDie instanceof agyc) {
                                b = invokeOrDie.equals(agyc.b);
                            }
                            else if (invokeOrDie instanceof MessageLite) {
                                if (invokeOrDie != ((MessageLite)invokeOrDie).getDefaultInstanceForType()) {
                                    break Label_0770;
                                }
                                continue;
                            }
                            else {
                                if (!(invokeOrDie instanceof Enum)) {
                                    break Label_0770;
                                }
                                if (((Enum)invokeOrDie).ordinal() != 0) {
                                    break Label_0770;
                                }
                                continue;
                            }
                            if (b) {
                                continue;
                            }
                        }
                    }
                    else if (!(boolean)agzi.invokeOrDie(method5, (Object)messageLite, new Object[0])) {
                        continue;
                    }
                }
                b(sb, n, substring, invokeOrDie);
            }
        }
        if (messageLite instanceof agzd) {
            final Iterator e = ((agzd)messageLite).l.e();
            while (e.hasNext()) {
                final Map.Entry<agzf, V> entry2 = e.next();
                final int b2 = entry2.getKey().b;
                final StringBuilder sb2 = new StringBuilder("[");
                sb2.append(b2);
                sb2.append("]");
                b(sb, n, sb2.toString(), entry2.getValue());
            }
        }
        final ahcc unknownFields = ((agzi)messageLite).unknownFields;
        if (unknownFields != null) {
            for (int j = n2; j < unknownFields.b; ++j) {
                b(sb, n, String.valueOf(ahco.a(unknownFields.c[j])), unknownFields.d[j]);
            }
        }
    }
}
