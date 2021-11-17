package tp7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		DirMonitor dir = new DirMonitor(Paths.get("test"));
		dir.ls();
		System.out.println(dir.sizeOfFiles());
		System.out.println(dir.mostRecent());
		Path tmpDir = Files.createTempDirectory("listfiles-test");
		final Path directory = Files.createTempDirectory(tmpDir, null);
		DirMonitor dm = new DirMonitor(directory);
		
		Path last = null;
		for(int i=0;i<6;++i) {
			Path tmpFile = Files.createTempFile(directory, null, null);
			last = tmpFile;
			Thread.sleep(1000);
		}
		
		System.out.println(last.toString());
		System.out.println(dm.mostRecent());
	}

}
