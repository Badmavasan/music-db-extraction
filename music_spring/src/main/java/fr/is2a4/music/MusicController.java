package fr.is2a4.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/music")
public class MusicController {
	
	@Autowired
	MusicRepository rep;
	
	@GetMapping("/")
	public String dispFormMusic(ModelMap modelmap) {
		return "formMusic";
	}
	
	@GetMapping("/disp")
	public String dispTrack(@RequestParam(required=true) String track, ModelMap modelmap) {
		System.out.println(rep.findAllMusicByTrack(track));
		modelmap.addAttribute("musics",rep.findAllMusicByTrack(track));
		return "dispMusic";
	}
	
}
