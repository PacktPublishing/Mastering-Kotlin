//
//  ViewController.swift
//  iosapp
//
//  Created by Nate Ebel on 8/22/19.
//  Copyright © 2019 packt. All rights reserved.
//

import UIKit
import core

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = Platform.init().name
        view.addSubview(label)
    }


}

